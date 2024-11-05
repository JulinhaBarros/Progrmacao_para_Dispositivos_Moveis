package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonEnviarFormulario = findViewById(R.id.buttonEnviarFormulario);
        EditText editTextNomeFormulario = findViewById(R.id.editTextNomeFormulario);
        EditText editTextSenha = findViewById(R.id.editTextSenha);
        EditText editTextConfirmarSenha = findViewById(R.id.editTextConfirmarSenha);
        TextView textViewSaida = findViewById(R.id.textViewSaidaFormulario);

        Button buttonFormularioProximaActivity = findViewById(R.id.buttonFormularioProximaActivity);
        Button buttonFormularioAnteriorActivity = findViewById(R.id.buttonFormularioAnteriorActivity);

        buttonEnviarFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextNomeFormulario.getText().toString();
                String senha = editTextSenha.getText().toString();
                String confirmarSenha = editTextConfirmarSenha.getText().toString();

                if (senha.equals(confirmarSenha)){
                    textViewSaida.setText(nome + ", sua senha foi criada com sucesso!");
                } else {
                    textViewSaida.setText(nome + ", as senhas não combinam.\nTente novamente!");
                }
            }
        });

        buttonFormularioAnteriorActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormularioActivity.this, NomeActivity.class);
                startActivity(intent);

            }
        });
        buttonFormularioProximaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormularioActivity.this, GeradorUUIDActivity.class);
                startActivity(intent);
            }
        });
    }
}