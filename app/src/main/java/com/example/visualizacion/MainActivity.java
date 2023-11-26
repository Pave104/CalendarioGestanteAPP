package com.example.visualizacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     int semanas;
    EditText dataDia;
    EditText dataMes;
    EditText dataAno;
    TextView resultSet;
      Button btn;
       Button botao;
      ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDia=findViewById(R.id.txtdia);
        dataMes=findViewById(R.id.txtmMes);
        dataAno=findViewById(R.id.editTextTextPersonName3);
        resultSet=findViewById(R.id.textView3);
       btn=findViewById(R.id.butnCalcula);
       btn.setOnClickListener((android.view.View.OnClickListener)this);
        botao=findViewById(R.id.button);



    }

      public void  onClick(View v){
          int dia=  Integer.parseInt(dataDia.getText().toString());
          int mes=  Integer.parseInt(dataMes.getText().toString());
          int ano=  Integer.parseInt(dataAno.getText().toString());
          LocalDate hoje=LocalDate.now();
          LocalDate nova=LocalDate.of(ano,mes,dia);
          DateTimeFormatter  formatar =DateTimeFormatter.ofPattern("dd/MM/yyyy");
          long period= ChronoUnit.DAYS.between(nova,hoje);
          nova=nova.plusDays(7);
          nova=nova.plusMonths(9);
          img=(ImageView) findViewById(R.id.imageView);
           int se=(int)period/7;
          int dias=(int)period %7;

             semanas=se;




          String resultado="Voce esta com "+ ""+ String.valueOf(semanas)+ " semanas e "+"" +String.valueOf(dias)+" " +"dias de gestação"
          +"" +""+"-A data provável do parto é " +String.valueOf (nova.format(formatar)+ ""+"-A figura acima é meramente ilustrativa");


        resultSet.setText(resultado);
         carregarImagens(se);

    }
      public void carregarImagens(int i){
        semanas=i;

          if(semanas==1){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/Como-Acontece-a-Gravidez-1-300x300.jpg").into(img);
          }

          if(semanas==2){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/Como-Acontece-a-Gravidez-1-300x300.jpg").into(img);
          }

          if(semanas==3){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/Como-Acontece-a-Gravidez-1-300x300.jpg").into(img);
          }
          if(semanas==4){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/4-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==5){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/5-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==6){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/6-semanas-de-gestacao-1-300x300.jpg").into(img);
          }

          if(semanas==7){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/7-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==8){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/8-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==9){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/9-semanas-de-gestacao-1-300x300.jpg").into(img);
          }

          if(semanas==10){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/10-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==11){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/11-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==12){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/12-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==13){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/13-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==14){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/14-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==15){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/15-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==16){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/16-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==17){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/17-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==18){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/18-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==19){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/19-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==20){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/20-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==21){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/21-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==22){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/22-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==23){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/23-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==24){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/24-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==25){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/25-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==26){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/26-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==27){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/27-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==28){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/28-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==29){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/29-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==30){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/30-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==31){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/31-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==32){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/32-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==33){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/33-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==34){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/34-semanas-de-gestacao-1.jpg").into(img);
          }
          if(semanas==35){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/35-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==36){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/36-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==37){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/37-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==38){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/38-semanas-de-gestacao-1-300x300.jpg").into(img);
          }
          if(semanas==39){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/39-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==40){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/40-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==41){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/40-semanas-de-gestacao-300x300.jpg").into(img);
          }
          if(semanas==42){
              Picasso.get().load("https://www.trocandofraldas.com.br/wp-content/uploads/40-semanas-de-gestacao-300x300.jpg").into(img);
          }
    }
   public void telaImc(View view){
       Intent intent=new Intent(this,ActivityImc.class);
      intent.putExtra("semana",semanas);
       startActivity(intent);

   }

}