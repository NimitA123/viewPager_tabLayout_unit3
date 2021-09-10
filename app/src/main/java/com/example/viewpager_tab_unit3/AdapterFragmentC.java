package com.example.viewpager_tab_unit3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFragmentC extends RecyclerView.Adapter<ViewHolderFragmentC> {
    private ArrayList<ModelClass> modelClasses;

    public AdapterFragmentC(ArrayList<ModelClass> modelClasses) {
        this.modelClasses = modelClasses;
    }

    @NonNull
    @Override
    public ViewHolderFragmentC onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolderFragmentC(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFragmentC holder, int position) {
        ModelClass modelClass = modelClasses.get(position);
        holder.setData(modelClass);

    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }
}
