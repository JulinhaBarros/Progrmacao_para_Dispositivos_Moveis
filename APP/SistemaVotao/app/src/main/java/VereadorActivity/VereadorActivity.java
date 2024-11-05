package VereadorActivity;


import android.os.Bundle;

import com.example.sistemavotao.BaseCargoActivity;
import com.example.sistemavotao.R;

import PresidenteActivity.PresidenteActivity;

public class VereadorActivity extends BaseCargoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa o cargo para Vereador e configura o próximo passo como PresidenteActivity
        inicializarViews("Vereador");
        findViewById(R.id.buttonConfirmar).setOnClickListener(v -> confirmarVoto("Vereador", PresidenteActivity.class));
    }
}

