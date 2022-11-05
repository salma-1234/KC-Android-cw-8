package com.example.phonsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.collection.ArraySet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<galaxies> itemsIst = new ArrayList<>();

    @Override

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        galaxies galaxy1 = new galaxies("MilkyWay", "sagittarius", R.drawable.milkyway_galaxy);
        galaxies galaxy2 = new galaxies("Andromida", "andromeda", R.drawable.andromeda_galaxy__with);
        galaxies galaxy3 = new galaxies("BlackEye", "coma Berenices", R.drawable._05px_blackeyegalaxy);

        ArrayList<galaxies> galaxies = new ArrayList<>();

        galaxies.add(galaxy1);
        galaxies.add(galaxy2);
        galaxies.add(galaxy3);


        galaxiesAdapter adapter = new galaxiesAdapter(this, 0,galaxies );
        ListView listView = findViewById(R.id.galaxylist1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                galaxies cuurentGalaxy = galaxies.get(i);

                Intent intent = new Intent(MainActivity.this,MainActivity_details.class);
                startActivity(intent);
            }
        });

        }


    }

