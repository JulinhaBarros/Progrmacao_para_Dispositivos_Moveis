package com.example.appreceita;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        TextView tvRecipeName = findViewById(R.id.tv_recipe_name);
        TextView tvRecipeDetails = findViewById(R.id.tv_recipe_details);

        String recipeName = getIntent().getStringExtra("selected_recipe");
        tvRecipeName.setText(recipeName);

        String recipeDetails = getRecipeDetails(recipeName);
        tvRecipeDetails.setText(recipeDetails);
    }

    private String getRecipeDetails(String recipeName) {
        switch (recipeName) {
            case "Lasanha à Bolonhesa":
                return "Ingredientes:\n" +
                        "- 500g de carne moída\n" +
                        "- 1 pacote de massa para lasanha\n" +
                        "- 300g de queijo muçarela\n" +
                        "- 1 lata de molho de tomate\n" +
                        "- 1 cebola\n" +
                        "- 2 dentes de alho\n" +
                        "- Sal e pimenta a gosto\n\n" +
                        "Modo de preparo:\n" +
                        "1. Refogue a cebola e o alho, adicione a carne moída e cozinhe até dourar.\n" +
                        "2. Adicione o molho de tomate e tempere com sal e pimenta.\n" +
                        "3. Em uma travessa, monte camadas de massa, molho e queijo.\n" +
                        "4. Asse no forno pré-aquecido a 180°C por 30-40 minutos.";

            case "Frango ao Curry":
                return "Ingredientes:\n" +
                        "- 500g de peito de frango\n" +
                        "- 1 colher de sopa de curry\n" +
                        "- 200ml de leite de coco\n" +
                        "- 1 cebola\n" +
                        "- 2 dentes de alho\n" +
                        "- Sal e pimenta a gosto\n\n" +
                        "Modo de preparo:\n" +
                        "1. Refogue a cebola e o alho, adicione o frango e doure.\n" +
                        "2. Adicione o curry, misture bem e acrescente o leite de coco.\n" +
                        "3. Cozinhe em fogo baixo por 20 minutos.";

            case "Moqueca de Peixe":
                return "Ingredientes:\n" +
                        "- 1kg de peixe (cação ou dourado)\n" +
                        "- 2 pimentões (um verde, um vermelho)\n" +
                        "- 2 tomates\n" +
                        "- 1 cebola\n" +
                        "- 200ml de leite de coco\n" +
                        "- Coentro e sal a gosto\n\n" +
                        "Modo de preparo:\n" +
                        "1. Em uma panela, coloque camadas de peixe, pimentão, tomate e cebola.\n" +
                        "2. Adicione o leite de coco e tempere com coentro e sal.\n" +
                        "3. Cozinhe em fogo médio por 30 minutos.";

            case "Risoto de Funghi":
                return "Ingredientes:\n" +
                        "- 300g de arroz arbóreo\n" +
                        "- 100g de funghi seco\n" +
                        "- 1 cebola\n" +
                        "- 1 taça de vinho branco\n" +
                        "- Caldo de legumes\n" +
                        "- 50g de queijo parmesão\n\n" +
                        "Modo de preparo:\n" +
                        "1. Hidrate o funghi em água quente.\n" +
                        "2. Refogue a cebola, adicione o arroz e depois o vinho branco.\n" +
                        "3. Adicione o caldo aos poucos até o arroz cozinhar.\n" +
                        "4. Misture o funghi e o parmesão no final.";

            case "Feijoada Tradicional":
                return "Ingredientes:\n" +
                        "- 1kg de feijão preto\n" +
                        "- 500g de carne seca\n" +
                        "- 200g de linguiça\n" +
                        "- 200g de paio\n" +
                        "- 1 cebola\n" +
                        "- 3 dentes de alho\n" +
                        "- Sal a gosto\n\n" +
                        "Modo de preparo:\n" +
                        "1. Cozinhe o feijão com as carnes por 1 hora.\n" +
                        "2. Refogue a cebola e o alho e adicione ao feijão.\n" +
                        "3. Deixe cozinhar por mais 30 minutos.";

            case "Salmão Grelhado com Ervas":
                return "Ingredientes:\n" +
                        "- 4 filés de salmão\n" +
                        "- Ervas frescas (alecrim, tomilho)\n" +
                        "- Azeite\n" +
                        "- Sal e pimenta a gosto\n\n" +
                        "Modo de preparo:\n" +
                        "1. Tempere o salmão com as ervas, azeite, sal e pimenta.\n" +
                        "2. Grelhe em uma frigideira por 5 minutos de cada lado.";

            case "Bolo de Cenoura com Chocolate":
                return "Ingredientes:\n" +
                        "- 3 cenouras\n" +
                        "- 3 ovos\n" +
                        "- 1 xícara de óleo\n" +
                        "- 2 xícaras de açúcar\n" +
                        "- 2 xícaras de farinha de trigo\n" +
                        "- 1 colher de sopa de fermento\n\n" +
                        "Modo de preparo:\n" +
                        "1. Bata no liquidificador as cenouras, ovos e óleo.\n" +
                        "2. Misture o açúcar, a farinha e o fermento em uma tigela.\n" +
                        "3. Junte a mistura do liquidificador e mexa bem.\n" +
                        "4. Asse em forno pré-aquecido a 180°C por 40 minutos.";

            case "Pudim de Leite Condensado":
                return "Ingredientes:\n" +
                        "- 1 lata de leite condensado\n" +
                        "- 2 medidas da lata de leite\n" +
                        "- 3 ovos\n" +
                        "- 1 xícara de açúcar (para o caramelo)\n\n" +
                        "Modo de preparo:\n" +
                        "1. Caramelize o açúcar em uma forma de pudim.\n" +
                        "2. Bata os demais ingredientes no liquidificador e despeje na forma caramelizada.\n" +
                        "3. Asse em banho-maria por 1 hora.";

            case "Strogonoff de Frango":
                return "Ingredientes:\n" +
                        "- 500g de peito de frango\n" +
                        "- 1 cebola\n" +
                        "- 1 lata de creme de leite\n" +
                        "- 200g de cogumelos\n" +
                        "- 3 colheres de ketchup\n" +
                        "- Sal e pimenta a gosto\n\n" +
                        "Modo de preparo:\n" +
                        "1. Refogue a cebola, adicione o frango e doure.\n" +
                        "2. Acrescente os cogumelos, o ketchup e o creme de leite.\n" +
                        "3. Cozinhe por 10 minutos e sirva.";

            default:
                return "Detalhes não disponíveis.";
        }
    }
}

