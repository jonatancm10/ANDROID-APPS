package com.example.jonatan.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //Se crea en cuanto se introduce la line de log
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        // pasar a otra actividad y pasar informacaion a la otra activity
        Button boton1 = (Button) findViewById(R.id.button1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtent = (EditText) findViewById(R.id.text);
                String vstring = txtent.getText().toString();
                Intent inb1 = new Intent(MainActivity.this, SecondActivity.class);
                inb1.putExtra("valor1",vstring);
                startActivityForResult(inb1, 100);//ticket de comprovante de que solucion estamos hablando
            }
        });
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 100) && (resultCode == Activity.RESULT_OK)){
            Bundle resultAct = data.getExtras();
            String stresult = resultAct.getString("valor12");
            TextView txsort = (TextView) findViewById(R.id.textView2);
            txsort.setText(stresult);
            txsort.setTextSize(20);
            Toast.makeText(this, stresult, Toast.LENGTH_LONG).show();

        }
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
