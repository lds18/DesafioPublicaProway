package com.example.desafiopublicaproway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Função que abre à activity_cadastro
    public void AbrirEstatisticas(View view){
        Intent intent = new Intent(MainActivity.this, Estatistica.class);
        startActivity(intent);
    }

    // Função que abre à activity_estatitica
    public void AbrirCadastro(View view){
        Intent intent = new Intent(MainActivity.this, Cadastro.class);
        startActivity(intent);
    }
}