package com.example.visualizacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityImc extends AppCompatActivity {

    TextView txtsemana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        txtsemana=(TextView) findViewById(R.id.textView5);
            Bundle pacote=getIntent().getExtras();
            int s=pacote.getInt("semana");
            String txt=String.valueOf(s);
            txtsemana.setText(txt);


         }


    }
