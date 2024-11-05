package PresidenteActivity;


import android.os.Bundle;
import android.widget.Toast;

import com.example.sistemavotao.BaseCargoActivity;
import com.example.sistemavotao.R;

public class PresidenteActivity extends BaseCargoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa o cargo para Presidente e finaliza a votação ao confirmar
        inicializarViews("Presidente");
        findViewById(R.id.buttonConfirmar).setOnClickListener(v -> {
            confirmarVoto("Presidente", null);
            Toast.makeText(this, "Votação Finalizada! Obrigado.", Toast.LENGTH_LONG).show();
            finish();
        });
    }
}

