package com.example.jonatan.myfirstapp;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageInfo extends AppCompatActivity {

    ImageView logo2;
    TextView textInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_info);

        textInfo = (TextView) findViewById(R.id.textInfo);
        logo2 = (ImageView) findViewById(R.id.logo2);

        Bundle intentData = getIntent().getExtras();

        String info = intentData.getString("textInfo");
        textInfo.setText(info);
        setMuntanyaImage(info, logo2);
    }

    public void setMuntanyaImage(String nom, ImageView logo2) {
        switch (nom) {
            case "Montseny":
                logo2.setImageResource(R.drawable.foto);
                break;
            case "Mont perdut":
                logo2.setImageResource(R.drawable.foto1);
                break;
            case "Torre de Saruman":
                logo2.setImageResource(R.drawable.foto2);
                break;
            case "Mont everest":
                logo2.setImageResource(R.drawable.foto3);
                break;
            case "Montjuic":
                logo2.setImageResource(R.drawable.foto);
                break;
            case "Montardo":
                logo2.setImageResource(R.drawable.foto);
                break;
            default:
                break;
        }
    }
}
