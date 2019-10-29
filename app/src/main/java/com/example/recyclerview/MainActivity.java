package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Rudi Susanto","Pak Rudi",getDrawable(R.drawable.draw1)));
        keluargaArrayList.add(new Keluarga("Sjolichah","Bu Ugik",getDrawable(R.drawable.draw1)));
        keluargaArrayList.add(new Keluarga("Dimas Alif Fajar Fadhillah","Dimas",getDrawable(R.drawable.draw2)));
        keluargaArrayList.add(new Keluarga("Dannisa Asasabilah Adilzah Kinanti","Dilsa",getDrawable(R.drawable.draw4)));
        keluargaArrayList.add(new Keluarga("Danish Zahrah Zayyan Kammila Kinanti","Danish",getDrawable(R.drawable.draw3)));
    }
}
