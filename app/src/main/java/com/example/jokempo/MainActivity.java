package com.example.jokempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Iniciar(View view){
        ImageButton imgJogador = findViewById(R.id.imageButtonJogador);
        ImageButton imgMaquina = findViewById(R.id.imageButtonMaquina);

        int jogada = new Random().nextInt(3);

        if(jogada == 0){
            imgMaquina.setImageResource(R.drawable.pedra);
        }else if(jogada == 1){
            imgMaquina.setImageResource(R.drawable.papel);
        }else if(jogada == 2){
            imgMaquina.setImageResource(R.drawable.tesoura);
        }
    }
}
