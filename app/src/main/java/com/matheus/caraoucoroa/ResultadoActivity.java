package com.matheus.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Integer numero;
    private ImageView res;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        res = findViewById(R.id.imageViewResultado);
        buttonVoltar =  findViewById(R.id.buttonVoltar);

        Bundle num = getIntent().getExtras();
        numero = num.getInt("numero");
        jogar(numero);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });



    }

    public void jogar(Integer numero){
        if(numero == 0){
            res.setImageResource(R.drawable.moeda_cara);

        }else{
            res.setImageResource(R.drawable.moeda_coroa);
        }
    }
}
