package com.example.exibirnome;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private Button buttonSaudacao;
    private TextView textViewMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os componentes da interface aos objetos do código
        editTextNome = findViewById(R.id.editTextNome);
        buttonSaudacao = findViewById(R.id.buttonSaudacao);
        textViewMensagem = findViewById(R.id.textViewMensagem);

        // Configurando o botão para deixá-loo funcional
        buttonSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            // Obtendo nome digitado pelo usuário
            String nome = editTextNome.getText().toString();

            // Exibindo a mensagem
            textViewMensagem.setText("Seja bem-vindo(a), " + nome + "!");

            }
        });
    }
}