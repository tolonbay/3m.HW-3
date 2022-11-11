package com.example.a3mhw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView tvAnimal;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAnimal = itemView.findViewById(R.id.tv_animals);
    }
    public void bind(String animal){
        tvAnimal.setText(animal);
    }
}
