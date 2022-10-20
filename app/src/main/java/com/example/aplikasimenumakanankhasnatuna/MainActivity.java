package com.example.aplikasimenumakanankhasnatuna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recMakanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Makanan> listMakanan;

    void dataMakanan(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Cikong","Cikong Minuman segar khas natuna yang sangat populer dan banyak penggemarnya",15000,R.drawable.cikong));
        listMakanan.add(new Makanan("Kernas","Kernas makanan kudapan atau cemilan berbahan dasar ikan tongkol dan sagu butir bercita rasa gurih",10000,R.drawable.kernas));
        listMakanan.add(new Makanan("Latoh Silong","Latoh Silong sendiri merupakan tumbuhan laut bisa di sebut anggur laut",20000,R.drawable.latohsilong));
        listMakanan.add(new Makanan("Lempar","Lempar ada dua, terbuat dari ubi kayu dan beras ketan yang berisi abon ikan pedas",20000,R.drawable.lepar));
        listMakanan.add(new Makanan("Pedek","Makanan pedek sendiri terbuat dari ikan teri atau bilis yang di asinkan dahulu",25000,R.drawable.pedek));
        listMakanan.add(new Makanan("Tabel Mando","tabel Mando sering disebut pizza Natuna yang dibuat dari seafood dan sagu bulir",30000,R.drawable.tabelmando));
        data();
    }
    void data(){
        recMakanan = findViewById(R.id.recMenu);
        adapter = new MakananAdapter(this,listMakanan);
        layoutManager = new LinearLayoutManager(this);
        recMakanan.setLayoutManager(layoutManager);
        recMakanan.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataMakanan();

    }
}