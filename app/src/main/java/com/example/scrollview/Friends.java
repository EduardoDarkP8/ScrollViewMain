package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class Friends extends AppCompatActivity {
    int perfil;
    Button Olho;
    Button Steven;
    Button Goku;
    TextView NomePerfil;
    String nome;

    void incializar()
    {

        Olho = (Button) findViewById(R.id.btnOlhoAnonimo);
        Steven = (Button) findViewById(R.id.btnSteven);
        Goku = (Button) findViewById(R.id.btnGoku);
        NomePerfil = (TextView) findViewById(R.id.NomedoPerfil);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        incializar();
        Intent recive = getIntent();
        nome = recive.getStringExtra(MainActivity.NOME);
        NomePerfil.setText(nome);
        Olho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CriarPerfi(R.string.OlhoNome);
            }
        });
        Steven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CriarPerfi(R.string.StevenNome);
            }
        });
        Goku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CriarPerfi(R.string.GokuNome);
            }
        });

    }
    void CriarPerfi(int nome)
    {
        Intent intent = new Intent(this,Perfil.class);
        switch(nome)
        {
            case R.string.OlhoNome:
                perfil = 1;
                break;
            case R.string.StevenNome:
                perfil = 2;
                break;
            case R.string.GokuNome:
                perfil = 3;
                break;
        }
        intent.putExtra("VALUE",perfil);
        startActivity(intent);
    }
}