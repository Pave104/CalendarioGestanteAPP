package com.example.visualizacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_tela);
        Handler ha=new Handler();
         ha.postDelayed(new Runnable() {
             @Override
             public void run() {
                 iniciateladois();
             }
         },4000);


    }
   private void iniciateladois(){

       Intent i=new Intent(this,MainActivity.class);
               startActivity(i);
             finish();
  }


}