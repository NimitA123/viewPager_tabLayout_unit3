package com.example.viewpager_tab_unit3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFragmentB extends RecyclerView.Adapter<ViewHolderFragmentB> {
    private ArrayList<ModelClass> modelClasses;

    public AdapterFragmentB(ArrayList<ModelClass> modelClasses) {
        this.modelClasses = modelClasses;
    }

    @NonNull
    @Override
    public ViewHolderFragmentB onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolderFragmentB(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFragmentB holder, int position) {
        ModelClass modelClass = modelClasses.get(position);
        holder.setData(modelClass);

    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }
}
