package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TimeLIne extends AppCompatActivity {
    TextView NomeTmlED;
    Button Voltar;
    Button Memes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);
        Intent ita = getIntent();
        String NomeTml = (ita.getStringExtra(MainActivity.NOME));
        NomeTmlED = (TextView) findViewById(R.id.tmedNome);
        NomeTmlED.setText(NomeTml);

        Memes = (Button)findViewById(R.id.btnFriend);
        Memes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirMemes();
            }
        });


    }

    void AbrirMemes()
    {
        Intent inte = new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.ifunny.com"));
        startActivity(inte);
    }
}