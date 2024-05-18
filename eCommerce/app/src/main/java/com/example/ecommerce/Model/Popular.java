package com.example.ecommerce.Model;

public class Popular {
    private String title;
    private String picUrl;
    private int review;
    private double score;
    private int numberInChart;
    private double price;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Popular(String title, String picUrl, int review, double score, double price, String description) {
        this.title = title;
        this.picUrl = picUrl;
        this.review = review;
        this.score = score;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getNumberInChart() {
        return numberInChart;
    }

    public void setNumberInChart(int numberInChart) {
        this.numberInChart = numberInChart;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
