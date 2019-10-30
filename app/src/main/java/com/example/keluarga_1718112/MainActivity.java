package com.example.keluarga_1718112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private recycleView recyclerView;
    private keluargaAdapter keluargaAdapter;
    private ArrayList<keluarga> keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new Keluarga_Adapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Agus Subroto", "Ayah",  getDrawable(R.drawable.bapak)));
        keluargaArrayList.add(new keluarga("Yuliati", "Ibu", getDrawable(R.drawable.ibuk)));
        keluargaArrayList.add(new keluarga("Aulya Rangga Saputra", "Anak Pertama", getDrawable(R.drawable.rangga)));
        keluargaArrayList.add(new keluarga("Sekar Yulianingtyas", "Anak Kedua", getDrawable(R.drawable.sekar)));
    }
}