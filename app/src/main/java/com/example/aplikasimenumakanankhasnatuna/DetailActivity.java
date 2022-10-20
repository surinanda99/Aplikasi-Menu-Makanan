package com.example.aplikasimenumakanankhasnatuna;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView imageViewFoto;
    TextView textViewNama, textViewDeskripsi, textViewHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageViewFoto = findViewById(R.id.imgfotodtl);
        textViewNama = findViewById(R.id.txtNamadtl);
        textViewDeskripsi = findViewById(R.id.txtdeskripsidtl);
        textViewHarga = findViewById(R.id.txtHargadtl);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("harga_makanan") && getIntent().hasExtra("gambar_makanan")){
            Integer fotoMakanan = getIntent().getIntExtra("gambar_makanan", 0);
            String deskripsiMakanan = getIntent().getStringExtra("deskripsi_makanan");
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String hargaMakanan = getIntent().getStringExtra("harga_makanan");

            setDataActivity(fotoMakanan, namaMakanan, deskripsiMakanan, hargaMakanan);
        }
    }
    private void setDataActivity(Integer fotoMakanan, String namaMakanan, String deskripsiMakanan, String hargaMakanan){
        imageViewFoto.setImageResource(fotoMakanan);
        textViewNama.setText(namaMakanan);
        textViewDeskripsi.setText(deskripsiMakanan);
        textViewHarga.setText("Harga : \t" +hargaMakanan);
    }
}
