package com.example.ejercicio2.services;

import com.example.ejercicio2.models.ResponseApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiDummyjso {
    @GET("Products")
    Call<ResponseApi> getAllProduct();
}
