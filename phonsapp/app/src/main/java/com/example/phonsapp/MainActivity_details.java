package com.example.phonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_details);

        Bundle b = getIntent().getExtras();

        ImageView galaxyImage = findViewById(R.id.imageView4);
        TextView  galaxyName = findViewById(R.id.textView3);
        TextView galaxyConstellation = findViewById(R.id.textView4);

        galaxies deliveredGalaxy =(galaxies) b.getSerializable("galaxy");

        galaxyName.setText(deliveredGalaxy.getGalaxyName());
        galaxyConstellation.setText(deliveredGalaxy.getGalaxyConstellation());
        galaxyImage.setImageResource(deliveredGalaxy.getGalaxyImage());


    }
}