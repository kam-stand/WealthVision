package com.WealthVision.sprinboot.controller;
import com.WealthVision.sprinboot.model.News;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @Value("${alpha.vantage.api.key}")
    private String apiKey;


    private static final String BASE_URL = "https://www.alphavantage.co/query?function=NEWS_SENTIMENT&apikey=";

    public String getApiUrl() {
        return BASE_URL + apiKey;
    }
    @GetMapping("")
    public ResponseEntity<List<News>> getMarketNews() {
        System.out.println("getMarketNews");
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(getApiUrl(), String.class);
        System.out.println("API response: " + response);
        System.out.println("API key: " + apiKey);

        List<News> newsList = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response);
            JsonNode feedArray = root.path("feed"); // Access the "feed" array

            for (JsonNode article : feedArray) {
                String title = article.path("title").asText();
                String url = article.path("url").asText();

                // Authors array
                List<String> authors = new ArrayList<>();
                for (JsonNode author : article.path("authors")) {
                    authors.add(author.asText());
                }

                String description = article.path("summary").asText();
                String bannerImage = article.path("banner_image").asText();
                String source = article.path("source").asText();

                News news = new News(title, url, authors, description, bannerImage, source);
                newsList.add(news);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok(newsList);
    }

}
