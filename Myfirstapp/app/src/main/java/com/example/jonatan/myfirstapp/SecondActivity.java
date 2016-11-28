package com.example.jonatan.myfirstapp;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtView2;
    Button bt2;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);

        txtView2 = (TextView) findViewById(R.id.textViewA2);
        Bundle intentdata = getIntent().getExtras();
        String txtpas = intentdata.getString("valor1");
        txtView2.setText(txtpas);
        txtView2.setTextSize(20);



    }
    public void onClick (View v){

        EditText edita = (EditText) findViewById(R.id.edit1);
        result = edita.getText().toString();

        result = result + " des de l'activitat 2";

        Intent intres = getIntent();
        intres.putExtra("valor12", result);
        setResult(RESULT_OK, intres);
        finish();

    }
}
