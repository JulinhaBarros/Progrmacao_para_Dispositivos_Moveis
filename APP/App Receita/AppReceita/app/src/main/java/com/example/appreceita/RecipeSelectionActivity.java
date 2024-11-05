package com.example.appreceita;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_selection);


        Button buttonLasanha = findViewById(R.id.button);
        Button buttonFrangoCurry = findViewById(R.id.button2);
        Button buttonMoqueca = findViewById(R.id.button4);
        Button buttonRisoto = findViewById(R.id.button5);
        Button buttonFeijoada = findViewById(R.id.button6);
        Button buttonSalmao = findViewById(R.id.button8);
        Button buttonBoloCenoura = findViewById(R.id.button11);
        Button buttonPudim = findViewById(R.id.button12);
        Button buttonStrogonoff = findViewById(R.id.button14);

        // Adicionar os listeners de clique para cada botão
        buttonLasanha.setOnClickListener(v -> openRecipeDetail("Lasanha à Bolonhesa"));
        buttonFrangoCurry.setOnClickListener(v -> openRecipeDetail("Frango ao Curry"));
        buttonMoqueca.setOnClickListener(v -> openRecipeDetail("Moqueca de Peixe"));
        buttonRisoto.setOnClickListener(v -> openRecipeDetail("Risoto de Funghi"));
        buttonFeijoada.setOnClickListener(v -> openRecipeDetail("Feijoada Tradicional"));
        buttonSalmao.setOnClickListener(v -> openRecipeDetail("Salmão Grelhado com Ervas"));
        buttonBoloCenoura.setOnClickListener(v -> openRecipeDetail("Bolo de Cenoura"));
        buttonPudim.setOnClickListener(v -> openRecipeDetail("Pudim de Leite Condensado"));
        buttonStrogonoff.setOnClickListener(v -> openRecipeDetail("Strogonoff de Frango"));
    }

    // Função para abrir a RecipeDetailActivity e passar o nome da receita selecionada
    private void openRecipeDetail(String recipeName) {
        Intent intent = new Intent(RecipeSelectionActivity.this, RecipeDetailActivity.class);
        intent.putExtra("selected_recipe", recipeName);
        startActivity(intent);
    }
}
