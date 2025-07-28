package com.WealthVision.sprinboot.model;

import java.util.ArrayList;
import java.util.List;

public class News {

    private String title;
    private String url;
    private List<String> authors = new ArrayList<>();
    private String description;
    private String banner_image;
    private String source;

    public News(){

    }

    public News(String title, String url, List<String> authors, String description, String banner_image, String source) {
        this.title = title;
        this.url = url;
        this.authors = authors;
        this.description = description;
        this.banner_image = banner_image;
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(String banner_image) {
        this.banner_image = banner_image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", authors=" + authors +
                ", description='" + description + '\'' +
                ", banner_image='" + banner_image + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
