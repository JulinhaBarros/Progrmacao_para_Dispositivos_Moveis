package com.example.sistemavotao;


import android.os.Bundle;

import VereadorActivity.VereadorActivity;

public class MainActivity extends BaseCargoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa o cargo para Prefeito e configura o próximo passo como VereadorActivity
        inicializarViews("Prefeito");
        findViewById(R.id.buttonConfirmar).setOnClickListener(v -> confirmarVoto("Prefeito", VereadorActivity.class));
    }
}

