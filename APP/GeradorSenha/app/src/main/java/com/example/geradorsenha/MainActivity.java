package com.example.geradorsenha;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final char[] lowercaseLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final char[] numbers = "0123456789".toCharArray();
    private final char[] specialChars = "!@#$%^&*()_+-=[]{}|;':\",.<>?/`~".toCharArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView passwordTextView = findViewById(R.id.passwordTextView);
        Button generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = generatePassword();
                passwordTextView.setText(password);
            }
        });
    }

    private String generatePassword() {
        Random random = new Random();
        List<Character> passwordChars = new ArrayList<>();

        for (int i =0; i < 3; i++) {
            passwordChars.add(lowercaseLetters[random.nextInt(lowercaseLetters.length)]);
        }

        for (int i = 0; i < 3; i++) {
            passwordChars.add(numbers[random.nextInt(numbers.length)]);
        }

        for (int i = 0; i < 3; i++) {
            passwordChars.add(specialChars[random.nextInt(specialChars.length)]);
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 3; i++){
            password.append(passwordChars.get(i));
            password.append(passwordChars.get(i + 3));
            password.append(passwordChars.get(i + 6));
        }

        List<Character> finalPasswordChars = new ArrayList<>();
        for (char c : password.toString().toCharArray()) {
            finalPasswordChars.add(c);
        }
        Collections.shuffle(finalPasswordChars);

        StringBuilder finalPassword = new StringBuilder();
        for (char c : finalPasswordChars) {
            finalPassword.append(c);
        }

        return finalPassword.toString();
    }
}