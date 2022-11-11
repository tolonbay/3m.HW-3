package com.example.a3mhw_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        animals = new ArrayList<>();
        animals.add("Snake");
        animals.add("Horse");
        animals.add("Donkey");
        animals.add("Cows");
        animals.add("Chicks");
        animals.add("Elephant");
        animals.add("Lion");

        AnimalAdapter adapter = new AnimalAdapter(animals);
        recyclerView.setAdapter(adapter);

    }
}