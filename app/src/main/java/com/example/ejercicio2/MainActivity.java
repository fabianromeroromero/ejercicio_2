package com.example.ejercicio2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio2.adapters.ProductAdapter;
import com.example.ejercicio2.database.ApiDummyJsonClient;
import com.example.ejercicio2.models.Product;
import com.example.ejercicio2.models.ResponseApi;
import com.example.ejercicio2.services.ApiDummyjso;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProductos;
    ProductAdapter productAdapter;
    LinkedList<Product> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProductos = findViewById(R.id.rvProductos);
        rvProductos.setLayoutManager(new LinearLayoutManager(this));
        obtenerProducto();
    }

    private LinkedList<Product> obtenerProducto(){
        productos = new LinkedList<>();
        ApiDummyjso api = ApiDummyJsonClient.getClient().create(ApiDummyjso.class);

        Call<ResponseApi> call = api.getAllProduct();

        call.enqueue(new Callback<ResponseApi>() {
            @Override
            public void onResponse(Call<ResponseApi> call, Response<ResponseApi> response) {
                if(response.isSuccessful()){
                    productAdapter = new ProductAdapter(response.body().getProducts());
                    rvProductos.setAdapter(productAdapter);
                }else {
                    Toast.makeText(MainActivity.this,"Error de usuario",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseApi> call, Throwable t) {
                System.out.println("Error servidor: "+t.getMessage());
                Toast.makeText(MainActivity.this,"Error en el servidor",Toast.LENGTH_LONG).show();
            }
        });
        return productos;
    }
}