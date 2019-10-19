package com.example.wisatajakarta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class WisataActivity extends AppCompatActivity {
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        Intent intent= getIntent();
        pos = intent.getExtras().getInt("Position");

        final CustomAdapter adapter= new CustomAdapter(this);
        final ImageView img= (ImageView) findViewById(R.id.imgid);
        final TextView nama= (TextView) findViewById(R.id.WisataNama);
        final TextView alamat= (TextView) findViewById(R.id.WisataAlamat);
        final TextView deskripsi= (TextView) findViewById(R.id.WisataDeskripsi);

        //Set data
        img.setImageResource(adapter.images[pos]);
        nama.setText(adapter.nama[pos]);
        alamat.setText(adapter.alamat[pos]);
        deskripsi.setText(adapter.deskripsi[pos]);

    }
}
