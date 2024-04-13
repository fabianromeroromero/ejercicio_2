package com.example.ejercicio2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio2.adapters.ProductAdapter;
import com.example.ejercicio2.models.Product;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProductos;

    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProductos = findViewById(R.id.rvProductos);
        rvProductos.setLayoutManager(new LinearLayoutManager(this));
        productAdapter = new ProductAdapter(obtenerProductos());
        rvProductos.setAdapter(productAdapter);


    }

    private LinkedList<Product> obtenerProductos(){
        LinkedList<Product> products = new LinkedList<>();
        products.add(new Product("Phone 15","apple", 1200, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Football_in_Bloomington%2C_Indiana%2C_1995.jpg/640px-Football_in_Bloomington%2C_Indiana%2C_1995.jpg", 4.5f));
        return products;
    }
}