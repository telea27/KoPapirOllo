package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView rock, paper, scissors;
    private Button btnKo, btnPapir, btnOllo;
    private TextView txtEmberValasztasa, txtGepValasztasa;
    private Random r;
    private int randomGomb, emberValasztott, gepPont, emberPont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKo.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            rock = findViewById(R.id.emberValasztas);
            emberValasztott=1;
        }
        });
        btnPapir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                paper = findViewById(R.id.emberValasztas);
                emberValasztott=2;
            }
        });
        btnOllo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                scissors = findViewById(R.id.emberValasztas);
                emberValasztott=3;
            }
        });

        r=new Random();
        randomGomb=r.nextInt(3)+1;
        if(randomGomb==1){
            rock=findViewById(R.id.gepValasztas);
        }
        else if(randomGomb==2){
            paper=findViewById(R.id.gepValasztas);
        }
        else if(randomGomb==3){
            scissors=findViewById(R.id.gepValasztas);
        }

        if(randomGomb==1&&emberValasztott==1){
            Context context = getApplicationContext();
            CharSequence text = "Döntetlen";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(randomGomb==2&&emberValasztott==2){
            Context context = getApplicationContext();
            CharSequence text = "Döntetlen";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(randomGomb==3&&emberValasztott==3){
            Context context = getApplicationContext();
            CharSequence text = "Döntetlen";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(randomGomb==1&&emberValasztott==2){

        }
    }
}
