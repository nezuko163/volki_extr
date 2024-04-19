package com.example.start_menu.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;


import com.example.start_menu.R;
import com.example.start_menu.adapter.LekarstvoHomeAdapterj;
import com.example.start_menu.adapter.onItemClickListener;
import com.example.start_menu.databinding.FragmentHomeBinding;

import com.example.start_menu.model.LekarstvoModelj;

import java.util.ArrayList;

public class Fragment_home extends Fragment {

    public FragmentHomeBinding fragmentHomeBinding;
    private LekarstvoHomeAdapterj adapter;
    private onItemClickListener onItemClickListener = new onItemClickListener() {
        @Override
        public void onCancelClick(LekarstvoModelj item) {

        }

        @Override
        public void onCheckClick(LekarstvoModelj item) {

        }
    };
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);

        initRcView();

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    private ArrayList<LekarstvoModelj> createData() {
        ArrayList<LekarstvoModelj> list = new ArrayList<>();
        list.add(new LekarstvoModelj(123L, "asd"));
        list.add(new LekarstvoModelj(123L, "zxc"));

        return list;
    }

    private void cancel() {
        int i = 0;
        i++;
    }
    private void initRcView() {
        adapter = new LekarstvoHomeAdapterj(createData(), onItemClickListener);
        fragmentHomeBinding.rcView.setLayoutManager(new LinearLayoutManager(getContext()));
        fragmentHomeBinding.rcView.setAdapter(adapter);
    }
}