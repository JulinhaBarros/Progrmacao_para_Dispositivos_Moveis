package com.example.calcurarfrete;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etPeso;
    private EditText etDistancia;
    private Button btnCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso = findViewById(R.id.etPeso);
        etDistancia = findViewById(R.id.etDistancia);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularFrete();
            }
        });
    }

    private void calcularFrete() {
        String pesoTexto = etPeso.getText().toString();
        String distanciaTexto = etDistancia.getText().toString();

        if (pesoTexto.isEmpty() || distanciaTexto.isEmpty()) {
            Toast.makeText(this, "Por favor, insira valores válidos.", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double peso = Double.parseDouble(pesoTexto);
            double distancia = Double.parseDouble(distanciaTexto);
            double valorFrete = calcularValorFrete(peso, distancia);
            tvResultado.setText(String.format("Resultado do Frete: R$ %.2f", valorFrete));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor, insira valores numéricos.", Toast.LENGTH_SHORT).show();
        }
    }

    private double calcularValorFrete(double peso, double distancia) {
        double valorCobradoPeloPeso;
        double valorKm;

        if (peso <= 25.0) {
            valorCobradoPeloPeso = 2.0;
            valorKm = 1.0;
        } else if (peso <= 50.0) {
            valorCobradoPeloPeso = 2.25;
            valorKm = 1.25;
        } else if (peso <= 75.0) {
            valorCobradoPeloPeso = 2.5;
            valorKm = 1.5;
        } else {
            valorCobradoPeloPeso = 3.0;
            valorKm = 2.0;
        }

        return (distancia * valorKm) + (peso * valorCobradoPeloPeso);
    }
}