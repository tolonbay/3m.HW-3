package com.example.a3mhw_3;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<String> animals;

    public AnimalAdapter(ArrayList<String> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animals,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
    holder.bind(animals.get(position));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
