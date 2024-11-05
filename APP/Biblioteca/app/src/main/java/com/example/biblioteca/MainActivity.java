package com.example.biblioteca;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurando o RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewBooks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Lista de livros reais com título, autor e data de lançamento
        List<Book> books = Arrays.asList(
                new Book("Dom Casmurro", "Machado de Assis", "1899"),
                new Book("O Alquimista", "Paulo Coelho", "1988"),
                new Book("Memórias Póstumas de Brás Cubas", "Machado de Assis", "1881"),
                new Book("Vidas Secas", "Graciliano Ramos", "1938")
        );

        // Configurando o adaptador com a lista de livros
        BookAdapter bookAdapter = new BookAdapter(books);
        recyclerView.setAdapter(bookAdapter);
    }
}
