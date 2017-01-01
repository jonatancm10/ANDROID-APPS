package com.example.jonatan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;


public class ActListCostum extends ListActivity {

    //Array per assosiar el adaptador
    static final String[] arrayMontains = new String[]{
            "Montseny",
            "Mont perdut",
            "Torre de Saruman",
            "Mont everest",
            "Montjuic",
            "Torre Avengers",
            "Monte del Destino"
    };
    static final String[] arrayAltitude = new String []{
            "1705", "3355", "3546", "1234","2345", "1435","3658"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ElmeuArrayAdapter(this, arrayMontains));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){

        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
        Intent showinfo = new Intent(ActListCostum.this, ImageInfo.class);
        showinfo.putExtra("textInfo", arrayAltitude[position]);
        startActivity(showinfo);

        //setListAdapter(new ImageInfo(this, arrayAltitude));

    }


}
