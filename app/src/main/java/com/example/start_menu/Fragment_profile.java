package com.example.start_menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.start_menu.databinding.FragmentProfileBinding;


public class Fragment_profile extends Fragment {

    public FragmentProfileBinding fragmentProfileBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentProfileBinding = FragmentProfileBinding.inflate(inflater, container, false);



        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}