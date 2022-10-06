package com.nata1993.grannyrecepies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.nata1993.grannyrecepies.databinding.Fragment1Binding;

public class Main_Fragment extends Fragment {

    private Fragment1Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = Fragment1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Soolalõhe
        binding.recepiesTextview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        // Täidetud kartulid
        binding.recepiesTextview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_ThirdFragment);
            }
        });

        // Praekartul
        binding.recepiesTextview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_FourthFragment);
            }
        });

        // Kisell
        binding.recepiesTextview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_FifthFragment);
            }
        });

        // Piimasupp
        binding.recepiesTextview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_SixthFragment);
            }
        });

        // Kalasupp
        binding.recepiesTextview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_SeventhFragment);
            }
        });

        // Püree
        binding.recepiesTextview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_EighthFragment);
            }
        });

        // Ahjukala
        binding.recepiesTextview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_NinthFragment);
            }
        });

        // Boršš
        binding.recepiesTextview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Main_Fragment.this)
                        .navigate(R.id.action_FirstFragment_to_TenthFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}