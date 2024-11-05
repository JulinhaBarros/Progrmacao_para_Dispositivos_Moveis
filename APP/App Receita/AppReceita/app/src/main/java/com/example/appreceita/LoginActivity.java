package com.example.appreceita;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etUsername = findViewById(R.id.email_input);
        EditText etPassword = findViewById(R.id.password_input);
        Button btnLoginConfirm = findViewById(R.id.login_button);

        btnLoginConfirm.setOnClickListener(view -> {
            String email = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            // Validação do formato de email
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                // Exibe mensagem de erro caso o email seja inválido
                Toast.makeText(LoginActivity.this, "Formato de e-mail inválido", Toast.LENGTH_SHORT).show();
                return;
            }

            // Aqui você pode adicionar outras validações, como verificar o tamanho da senha
            if (password.isEmpty() || password.length() < 6) {
                // Exibe mensagem de erro caso a senha seja muito curta
                Toast.makeText(LoginActivity.this, "A senha deve ter pelo menos 6 caracteres", Toast.LENGTH_SHORT).show();
                return;
            }

            //Se o e-mail e a senha forem válidos, redireciona para a próxima tela
            Intent intent = new Intent(LoginActivity.this, RecipeSelectionActivity.class);
            startActivity(intent);
        });
    }
}

