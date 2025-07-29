package com.WealthVision.sprinboot.controller;

import com.WealthVision.sprinboot.model.Company;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {


    @Value("${alpha.vantage.api.key}")
     String apiKey;

    @GetMapping("/{symbol}")
    public ResponseEntity<List<Company>> getCompanyOverview(@PathVariable String symbol) {
        String baseUrl = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + symbol + "&apikey=" + apiKey;
        System.out.println(apiKey);
        System.out.println(baseUrl);
        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(baseUrl, String.class);
        List<Company> companyList = new ArrayList<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode root = objectMapper.readTree(response);
            String Symbol = root.findValue("Symbol").asText();
            String name = root.findValue("Name").asText();
            String Description = root.findValue("Description").asText();
             String MarketCapitalization = root.findValue("MarketCapitalization").asText();
             String EPS = root.findValue("EPS").asText();
             String PERatio = root.findValue("PERatio").asText();
              String DilutedEPSTTM = root.findValue("DilutedEPSTTM").asText();
             String TrailingPE = root.findValue("TrailingPE").asText();
              String ForwardPE  = root.findValue("ForwardPE").asText();
              String    RevenueTTM = root.findValue("RevenueTTM").asText();
              String    ProfitMargin = root.findValue("ProfitMargin").asText();
              String    OperatingMarginTTM = root.findValue("OperatingMarginTTM").asText();

              String    DividendPerShare = root.findValue("DividendPerShare").asText();

              String    DividendYield = root.findValue("DividendYield").asText();

              String    QuarterlyEarningsGrowthYOY = root.findValue("QuarterlyEarningsGrowthYOY").asText();
              String    QuarterlyRevenueGrowthYOY = root.findValue("QuarterlyRevenueGrowthYOY").asText();

              Company company = new Company(
                      Symbol,
                      name,
                      Description,
                      MarketCapitalization,
                      EPS,
                      PERatio,
                      DilutedEPSTTM,
                      TrailingPE,
                      ForwardPE,
                      RevenueTTM,
                      ProfitMargin,
                      OperatingMarginTTM,
                      DividendPerShare,
                      DividendYield,
                      QuarterlyEarningsGrowthYOY,
                      QuarterlyRevenueGrowthYOY
              );
              companyList.add(company);

        } catch (JsonProcessingException e) {

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return ResponseEntity.ok(companyList);


    }

    @GetMapping("/monthly/{symbol}")
    public ResponseEntity<?> getCompany(@PathVariable String symbol) {
        String baseUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=" + symbol + "&apikey=" + apiKey;
        System.out.println(apiKey);
        System.out.println(baseUrl);
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(baseUrl, String.class);
        System.out.println(response);
        return ResponseEntity.ok(response);

    }


}
