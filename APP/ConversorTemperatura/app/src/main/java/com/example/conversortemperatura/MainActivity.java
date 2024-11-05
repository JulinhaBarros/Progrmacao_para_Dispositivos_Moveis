package com.example.conversortemperatura;

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

        final EditText campoTemperatura = findViewById(R.id.editTextTemperatura);
        Button botaoParaCelsius = findViewById(R.id.buttonConverterParaCelsius);
        Button botaoParaFahrenheit = findViewById(R.id.buttonConverterParaFahrenheit);
        final TextView textoResultado = findViewById(R.id.textViewResultado);

        botaoParaCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temperaturaTexto = campoTemperatura.getText().toString();

                if (!temperaturaTexto.isEmpty()) {
                    double temperaturaFahrenheit = Double.parseDouble(temperaturaTexto);
                    double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

                    textoResultado.setText(String.format("Temperatura: %.2f °C", temperaturaCelsius));
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, insira uma temperatura", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botaoParaFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temperaturaTexto = campoTemperatura.getText().toString();

                if (!temperaturaTexto.isEmpty()) {
                    double temperaturaCelsius = Double.parseDouble(temperaturaTexto);
                    double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

                    textoResultado.setText(String.format("Temperatura: %.2f °F", temperaturaFahrenheit));
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, insira uma temperatura", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
