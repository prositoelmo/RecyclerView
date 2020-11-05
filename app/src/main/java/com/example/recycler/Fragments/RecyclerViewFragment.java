package com.example.recycler.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recycler.R;
import com.example.recycler.Recursos.AdapterDatos;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    RecyclerView recyclerViewCanciones;
    ArrayList<String> listaCanciones;
    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_recycler_view, container, false);
        recyclerViewCanciones= (RecyclerView) view.findViewById(R.id.listaRecycler);
        recyclerViewCanciones.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        listaCanciones= new ArrayList<>();
        llenarLista();
        AdapterDatos adapterDatos=new AdapterDatos(listaCanciones);
        recyclerViewCanciones.setAdapter(adapterDatos);
        return view;
    }

    private void llenarLista() {
        for(int i=1;i<=50;i++){
            listaCanciones.add(" "+i+"    Cancion "+ i);
        }

    }
}
