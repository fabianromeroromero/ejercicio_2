package com.example.ejercicio2.models;

import java.util.LinkedList;

public class ResponseApi {
    private LinkedList<Product> products;

    public LinkedList<Product> getProducts() {
        return products;
    }

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }
}
