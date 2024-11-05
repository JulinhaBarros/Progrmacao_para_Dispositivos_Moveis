package com.example.sistemavotao;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public abstract class BaseCargoActivity extends AppCompatActivity {

    protected TextView textViewNumero, textViewCargo;
    protected ImageView imageViewCandidato;
    protected StringBuilder numeroDigitado = new StringBuilder();
    protected HashMap<String, Candidato> candidatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textViewNumero = findViewById(R.id.textViewNumero);
        textViewCargo = findViewById(R.id.textViewCargo);
        imageViewCandidato = findViewById(R.id.imageViewCandidato);

        configurarCandidatos();
        configurarTecladoNumerico();
    }

    // Configura os candidatos para cada cargo com seus respectivos números e imagens
    protected void configurarCandidatos() {
        candidatos = new HashMap<>();

        // Candidatos para Prefeito
        candidatos.put("11", new Candidato("João da Silva - Prefeito", R.drawable.prefeito_joao));
        candidatos.put("12", new Candidato("Maria dos Santos - Prefeita", R.drawable.prefeito_maria));

        // Candidatos para Vereador
        candidatos.put("21", new Candidato("Pedro Alves - Vereador", R.drawable.vereador_pedro));
        candidatos.put("22", new Candidato("Ana Lima - Vereadora", R.drawable.vereador_ana));

        // Candidatos para Presidente
        candidatos.put("31", new Candidato("José Oliveira - Presidente", R.drawable.presidente_jose));
        candidatos.put("32", new Candidato("Carla Souza - Presidente", R.drawable.presidente_carla));
    }

    // Inicializa as views para cada cargo específico
    protected void inicializarViews(String cargo) {
        textViewCargo.setText("Cargo: " + cargo);
    }

    // Confirma o voto e navega para a próxima activity ou finaliza o processo
    protected void confirmarVoto(String cargo, Class<?> proximaClasse) {
        if (numeroDigitado.length() < 2) {
            Toast.makeText(this, "Digite um número válido.", Toast.LENGTH_SHORT).show();
            return;
        }

        String numero = numeroDigitado.toString();
        Candidato candidato = candidatos.get(numero);

        if (candidato != null && candidato.nome.contains(cargo)) {
            Toast.makeText(this, "Voto confirmado para: " + candidato.nome, Toast.LENGTH_LONG).show();

            if (proximaClasse != null) {
                startActivity(new Intent(this, proximaClasse));
            } else {
                Toast.makeText(this, "Votação Finalizada! Obrigado.", Toast.LENGTH_LONG).show();
                finish();
            }
        } else {
            Toast.makeText(this, "Número inválido para o cargo atual.", Toast.LENGTH_LONG).show();
        }
    }

    // Configura o teclado numérico para capturar os números digitados
    private void configurarTecladoNumerico() {
        for (int i = 0; i <= 9; i++) {
            int resId = getResources().getIdentifier("button" + i, "id", getPackageName());
            Button button = findViewById(resId);
            int finalI = i;
            button.setOnClickListener(v -> {
                if (numeroDigitado.length() < 2) {
                    numeroDigitado.append(finalI);
                    textViewNumero.setText(numeroDigitado.toString());
                }
                verificarCandidato();
            });
        }

        findViewById(R.id.buttonCorrigir).setOnClickListener(v -> {
            numeroDigitado.setLength(0);
            textViewNumero.setText("");
            imageViewCandidato.setImageResource(0);
        });
    }

    // Verifica e exibe o candidato com base no número digitado
    private void verificarCandidato() {
        Candidato candidato = candidatos.get(numeroDigitado.toString());
        if (candidato != null) {
            textViewCargo.setText(candidato.nome);
            imageViewCandidato.setImageResource(candidato.imagemResId);
        } else {
            imageViewCandidato.setImageResource(0); // Remove a imagem se o número não for válido
        }
    }

    // Classe interna para armazenar informações dos candidatos
    class Candidato {
        String nome;
        int imagemResId;

        Candidato(String nome, int imagemResId) {
            this.nome = nome;
            this.imagemResId = imagemResId;
        }
    }
}

