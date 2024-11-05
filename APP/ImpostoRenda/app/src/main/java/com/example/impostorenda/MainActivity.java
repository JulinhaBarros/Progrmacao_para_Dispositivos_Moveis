package com.example.impostorenda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etSalario;
    private EditText etDeducoes;
    private Button btnCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os elementos da interface
        etSalario = findViewById(R.id.etSalario);
        etDeducoes = findViewById(R.id.etDeducoes);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        // Configurando o botão para calcular o imposto quando clicado
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularImposto();
            }
        });
    }

    // Método para calcular o imposto de renda
    private void calcularImposto() {
        String salarioTexto = etSalario.getText().toString();
        String deducoesTexto = etDeducoes.getText().toString();

        // Verificando se os campos estão preenchidos
        if (salarioTexto.isEmpty() || deducoesTexto.isEmpty()) {
            Toast.makeText(this, "Por favor, insira valores válidos.", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Convertendo os valores para double
            double salario = Double.parseDouble(salarioTexto);
            double deducoes = Double.parseDouble(deducoesTexto);
            double imposto = calcularImpostoRenda(salario, deducoes);

            // Exibindo o resultado no TextView
            if (imposto > 0) {
                tvResultado.setText(String.format("Imposto a pagar: R$ %.2f", imposto));
            } else {
                tvResultado.setText("Você não tem imposto a pagar.");
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor, insira valores numéricos.", Toast.LENGTH_SHORT).show();
        }
    }

    // Método auxiliar para calcular o imposto com base nas faixas de tributação
    private double calcularImpostoRenda(double salario, double deducoes) {
        double baseCalculo = salario - deducoes;
        double aliquota = 0.0;
        double parcelaADeduzir = 0.0;

        if (baseCalculo <= 22847.76) {
            aliquota = 0.0;
            parcelaADeduzir = 0.0;
        } else if (baseCalculo <= 33919.80) {
            aliquota = 0.075;
            parcelaADeduzir = 1713.58;
        } else if (baseCalculo <= 45012.60) {
            aliquota = 0.15;
            parcelaADeduzir = 4257.57;
        } else if (baseCalculo <= 55976.16) {
            aliquota = 0.225;
            parcelaADeduzir = 7633.51;
        } else {
            aliquota = 0.275;
            parcelaADeduzir = 10432.32;
        }

        // Calculando o imposto
        return (baseCalculo * aliquota) - parcelaADeduzir;
    }
}
