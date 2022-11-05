package com.example.phonsapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class galaxiesAdapter extends ArrayAdapter<galaxies> {

    List<galaxies> galaxyList;

    public galaxiesAdapter(@NonNull Context context, int resource, @NonNull List<galaxies> objects) {
        super(context, resource, objects);
        galaxyList = objects;
    }

    @NonNull
    @Override
    public View  getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.rowgalaxies,parent,false);

        galaxies cuurentGalaxy = galaxyList.get(position);

        TextView galaxyName = view.findViewById(R.id.galaxyname);
        TextView galaxyConstellation = view.findViewById(R.id.galaxycons);
        ImageView img = view.findViewById(R.id.imageView);
        ImageView delete = view.findViewById(R.id.delete);

galaxyName.setText(cuurentGalaxy.getGalaxyName());
galaxyConstellation.setText(cuurentGalaxy.getGalaxyConstellation());
img.setImageResource(cuurentGalaxy.getGalaxyImage());

  delete.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {


          AlertDialog.Builder alertbox =  new AlertDialog.Builder(view.getRootView().getContext());
          alertbox.setMessage("Sure you want to delete this galaxy inf?");
          alertbox.setTitle("confirmation");
          alertbox.setPositiveButton("delete", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                  galaxyList.remove(cuurentGalaxy);
                 notifyDataSetChanged();
                  Snackbar.make(getContext(),view,"The galaxy inf has been deleted",3000).setAction("Undo", new View.OnClickListener() {
                      @Override
                      public void onClick(View view) {
                          galaxyList.add(cuurentGalaxy);
                          notifyDataSetChanged();
                      }
                  }).show();
              }
          });

          alertbox.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {

              }
          });
          alertbox.show();
      }
  });
        return view;
    }

}

