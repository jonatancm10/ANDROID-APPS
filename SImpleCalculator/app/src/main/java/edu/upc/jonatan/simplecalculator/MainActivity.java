package edu.upc.jonatan.simplecalculator;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tag = "Events App1";
    Double Numero1, Numero2, Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "event onCreate()");

        TextView textBox = (TextView) findViewById(R.id.textView1);

        textBox.setText("Introduce dos valores en las casillas y luego pulsa RESULT ");
        textBox.setTextSize(20);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "event onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "event onResume()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "event onDestroy()");
    }

    @Override //metode que fa servir sobrecarrega el actual
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "event onRestart()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "event onStop()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "event onPause()");
    }
    public void onClickIgual(View miView)
    {
        RadioButton Bsuma = (RadioButton) findViewById(R.id.ButtonSum);
        RadioButton Bresta = (RadioButton) findViewById(R.id.ButtonRes);
        RadioButton Bmult = (RadioButton) findViewById(R.id.ButtonMult);
        RadioButton Bdiv = (RadioButton) findViewById(R.id.ButtonDiv);
        EditText N1 = (EditText) findViewById(R.id.Num1);
        EditText N2 = (EditText) findViewById(R.id.Num2);
        TextView Result = (TextView) findViewById(R.id.Result);

        Numero2 = Double.parseDouble(N2.getText().toString());
        Numero1 = Double.parseDouble(N1.getText().toString());

        if (Bsuma.isChecked()){
            Resultado = Numero1 + Numero2;
        }
        else if (Bresta.isChecked()){
            Resultado = Numero1-Numero2;
        }
        else if (Bdiv.isChecked()){
            Resultado = Numero1/Numero2;
        }
        else if (Bmult.isChecked()){
            Resultado = Numero1*Numero2;
        }
        Result.setText(Resultado.toString());
    }
    public void onClickLimpia(View miView) {
        Numero1 = 0.0;
        Numero2 = 0.0;
        EditText tv = (EditText) findViewById(R.id.Num1);
        EditText tv2 = (EditText) findViewById(R.id.Num2);
        TextView tv3 = (TextView) findViewById(R.id.Result);

        tv.setText("0");
        tv2.setText("0");
        tv3.setText("0.0");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.ButtonSum:
                if (checked)
                    break;
            case R.id.ButtonRes:
                if (checked)
                    break;
            case R.id.ButtonDiv:
                if (checked)
                    break;
            case R.id.ButtonMult:
                if (checked)
                    break;
        }
    }
}
