package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.listaRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        listDatos= new ArrayList<>();
        for(int i=1;i<=50;i++){
            listDatos.add(" "+i+"    Cancion "+ i);
        }
        com.example.recycler.AdapterDatos adapterDatos=new com.example.recycler.AdapterDatos(listDatos);
        recyclerView.setAdapter(adapterDatos);
    }
}