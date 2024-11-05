package com.example.calculadoraimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText campoPeso = findViewById(R.id.editTextPeso);
        final EditText campoAltura = findViewById(R.id.editTextAltura);
        Button botaoCalcular = findViewById(R.id.buttonCalcular);
        final TextView textoResultado = findViewById(R.id.editTextResultado);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoTexto = campoPeso.getText().toString();
                String alturaTexto = campoAltura.getText().toString();

                if (!pesoTexto.isEmpty() && !alturaTexto.isEmpty()) {
                    double peso = Double.parseDouble(pesoTexto);
                    double altura = Double.parseDouble(alturaTexto);

                    double imc = peso / Math.pow(altura, 2);

                    String categoria;
                    if (imc < 18.5) {
                        categoria = "Baixo peso";
                    } else if (imc < 25.0) {
                        categoria = "Peso normal";
                    } else if (imc < 30.0) {
                        categoria = "Sobrepeso";
                    } else if (imc < 35.0) {
                        categoria = "Obesidade Grau I";
                    } else if (imc < 40.0) {
                        categoria = "Obesidade Grau II";
                    } else {
                        categoria = "Obesidade Grau III";
                    }

                    textoResultado.setText(String.format("IMC: %.2f\nCategoria: %s", imc, categoria));
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
