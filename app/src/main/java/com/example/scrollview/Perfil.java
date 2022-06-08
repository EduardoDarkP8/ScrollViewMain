package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {
    int perfil;

    TextView Nome,Descricao;
    ImageView img;
    Intent divulgar;
    Button open;
    Switch swt;

    void Inicializar(){
        Nome = (TextView) findViewById(R.id.TextNome);
        Descricao = (TextView) findViewById(R.id.txtDescriPerfil);
        img = (ImageView) findViewById(R.id.ImgPerfil);
        open = (Button) findViewById(R.id.btnDivulgacaoPerfil);
        swt = (Switch) findViewById(R.id.Troca);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        Intent recive = getIntent();
        perfil = recive.getIntExtra("VALUE",0);
        Inicializar();
        swt.setChecked(true);
        Mudar(perfil);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(divulgar);
            }
        });
        swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true)
                {
                    img.setVisibility(View.VISIBLE);
                }
                if(isChecked == false)
                {
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
    void Mudar(int i)
    {
        switch (i)
        {
            case 1:
            Nome.setText(R.string.OlhoNome);
            Descricao.setText(R.string.OlhoDescricao);
            img.setImageResource(R.drawable.foto1);
            divulgar = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            break;

            case 2:
                Nome.setText(R.string.StevenNome);
                Descricao.setText(R.string.StevenDescricao);
                img.setImageResource(R.drawable.foto2);
                divulgar = new Intent(Intent.ACTION_VIEW);
                divulgar.setData(Uri.parse("geo:37.129192, -121.500116"));
            break;

            case 3:
                Nome.setText(R.string.GokuNome);
                Descricao.setText(R.string.GokuDescricao);
                img.setImageResource(R.drawable.foto3);
                divulgar = new Intent(AlarmClock.ACTION_SHOW_ALARMS);

            break;
        }
    }
}