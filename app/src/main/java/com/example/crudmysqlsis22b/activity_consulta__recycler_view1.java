package com.example.crudmysqlsis22b;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class activity_consulta__recycler_view1 extends AppCompatActivity {

    RecyclerView recyclerView;

    ProductsAdapter adapter;

    //MantenimientoMySQL manto = new MantenimientoMySQL();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta__recycler_view1);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adapter = new ProductsAdapter(activity_consulta__recycler_view1.this, manto.consultarAllArticulos(getApplicationContext()));
        //recyclerView.setAdapter(adapter);


    }
}
