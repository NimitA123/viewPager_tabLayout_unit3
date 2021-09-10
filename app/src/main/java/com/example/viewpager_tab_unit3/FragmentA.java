package com.example.viewpager_tab_unit3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList = new ArrayList<>();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
         //   mParam1 = getArguments().getString(ARG_PARAM1);
        //    mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        buildData();
        setAdapter();
    }

    private void buildData() {
        ModelClass modelClass = new ModelClass("Nimit", "Yuvan", "Seenu", "Ritu", "Situ", "Sachin", "Varsha");
        arrayList.add(modelClass);

    }

    private void setAdapter() {
        AdapterFragmentA adapterFragmentA = new AdapterFragmentA(arrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapterFragmentA);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.rvRecycleViewA);
    }
}