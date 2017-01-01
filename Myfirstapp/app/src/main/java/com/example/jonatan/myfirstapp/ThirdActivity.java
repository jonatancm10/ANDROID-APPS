package com.example.jonatan.myfirstapp;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.app.ListActivity;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class ThirdActivity extends ListActivity {

    //Array per asociar el adaptador
    static final String[] arrayMontains = new String[]{
            "Montseny",
            "Mont perdut",
            "Torre de Saruman",
            "Mont everest",
            "Montjuic",
            "Torre Avengers",
            "Monte del Destino"
    };
    //static final String[] arrayAltitude = new String []{
    //        "1705", "3355", "3546", "1234","2345", "1435","3658"
    //};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Crear adaptador, an base al layout
        setListAdapter( new ArrayAdapter<String> (this, R.layout.llitam, arrayMontains ));

        //Associem Lisv.adaptador a la vista.
        ListView lisv = getListView();
        lisv.setTextFilterEnabled(true);

       lisv.setOnItemClickListener(new OnItemClickListener(){
           public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
