package com.nata1993.grannyrecepies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.nata1993.grannyrecepies.databinding.Fragment10Binding;

// Boršš
public class Fragment10 extends Fragment {

    private Fragment10Binding binding;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        binding = Fragment10Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Fragment10.this)
                        .navigate(R.id.action_TenthFragment_to_FirstFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
