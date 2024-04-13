package com.example.ejercicio2.models;

public class Product {

    public Product() {
    }

    public Product(String title, String brand, double price, String thumbnail, float rating) {
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.thumbnail = thumbnail;
        this.rating = rating;
    }

    private String title;

    private String brand;

    private double price;

    private String thumbnail;

    private float rating;

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }


    public double getPrice() {
        return price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public float getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
