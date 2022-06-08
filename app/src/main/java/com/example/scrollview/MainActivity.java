package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button DescricaoBTN;
    Button NomeBTN;
    Button TimeLineBtn;
    Button Divulgacao;
    Button Amigos;
    TextView Nome;
    TextView Descricao;
    EditText NomeET;
    EditText DescricaoET;


    public final static String NOME = "UserNome.NomeNaTML";

    void inicializar() {
        Amigos = (Button) findViewById(R.id.btnAmigos2);
        Divulgacao = (Button) findViewById(R.id.btnDivulgacao);
        DescricaoBTN = (Button) findViewById(R.id.btnDescri);
        NomeBTN = (Button) findViewById(R.id.btnNome);
        Nome = (TextView) findViewById(R.id.tvNome);
        Descricao = (TextView) findViewById(R.id.tvDescricao);
        NomeET = (EditText) findViewById(R.id.txtName);
        DescricaoET = (EditText) findViewById(R.id.txtDescri);
        TimeLineBtn = (Button) findViewById(R.id.btnTimeLine);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        Divulgacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Canal();
            }
        });
        NomeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MudarStatus(NomeET, Nome);


            }
        });
        DescricaoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MudarStatus(DescricaoET, Descricao);
            }

        });
        TimeLineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Abrir();
            }
        });
        Amigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Abrir2();
            }
        });
    }

    public void MudarStatus(EditText editText, TextView textView) {
        String texto = editText.getText().toString();
        textView.setText(texto);
        editText.clearFocus();
        editText.setText("");
    }

    public void Canal() {
        Intent inte = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/darkp8lives"));
        startActivity(inte);
    }

    public void Abrir() {
        Intent inte = new Intent(this, TimeLIne.class);
        String intNome = Nome.getText().toString();
        inte.putExtra(NOME, intNome);
        startActivity(inte);
    }

    public void Abrir2() {
        Intent inte = new Intent(this, Friends.class);
        String intNome = Nome.getText().toString();
        inte.putExtra(NOME, intNome);
        startActivity(inte);

    }
}