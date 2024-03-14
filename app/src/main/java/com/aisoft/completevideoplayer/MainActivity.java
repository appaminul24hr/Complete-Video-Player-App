package com.aisoft.completevideoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    LinearLayout laySong1,laySong2, laySong3, laySong4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //find====================================
        laySong1 = findViewById(R.id.laySong1);
        laySong2 = findViewById(R.id.laySong2);
        laySong3 = findViewById(R.id.laySong3);
        laySong4 = findViewById(R.id.laySong4);



        //Onclick=========================================

        laySong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/IbVYdcOT-OI";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });



        laySong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/kHfGcbonRuM";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });



        laySong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/JMEbE609WOY";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });


        laySong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/24GngnukIFY";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}