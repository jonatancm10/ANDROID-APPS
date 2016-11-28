package com.example.jonatan.myfirstapp;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //Se crea en cuanto se introduce la line de log
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tag = "Events App1"; //para poner logs en la aplicación

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // se llama al metodo de la clase donde estan las funciones basicas del OS
        setContentView(R.layout.activity_main);
        Log.d(tag,"event onCreate()"); //para poner logs en la aplicación

        TextView textBox = (TextView)findViewById(R.id.textView1);
        Button button = (Button)findViewById(R.id.button1);

        textBox.setText("Hi world!!");
        textBox.setTextSize(20);
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag,"event onStart()");

    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag,"event onResume()");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"event onDestroy()");
    }
    @Override //metode que fa servir sobrecarrega el actual
    public void onRestart() {
        super.onRestart();
        Log.d(tag,"event onRestart()");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag,"event onStop()");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "event onPause()");
    }
}
