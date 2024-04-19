package com.example.start_menu.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.start_menu.R;
import com.example.start_menu.databinding.MainBinding;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public MainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = MainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(mainBinding.fragmentContainer.getId(), new Fragment_virus()).commit();

        Map<Integer, Fragment> fragmentMap = new HashMap<>();
        fragmentMap.put(R.id.virus, new Fragment_virus());
        fragmentMap.put(R.id.home, new Fragment_home());
        fragmentMap.put(R.id.profile, new Fragment_profile());

        mainBinding.bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragment = fragmentMap.get(item.getItemId());
            getSupportFragmentManager().beginTransaction().replace(mainBinding.fragmentContainer.getId(), fragment).commit();
            return true;
        });
    }
}