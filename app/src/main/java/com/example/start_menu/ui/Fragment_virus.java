package com.example.start_menu.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.start_menu.R;
import com.example.start_menu.databinding.FragmentVirusBinding;


public class Fragment_virus extends Fragment {

    public FragmentVirusBinding fragmentVirusBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentVirusBinding = FragmentVirusBinding.inflate(inflater, container,false);



        return inflater.inflate(R.layout.fragment_virus, container, false);
    }
}