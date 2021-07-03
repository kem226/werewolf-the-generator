package com.example.werewolfthegenerator.ui.backgrounds;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.werewolfthegenerator.R;

public class BackgroundsFragment extends Fragment {

    private BackgroundsViewModel backgroundsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        backgroundsViewModel =
                new ViewModelProvider(this).get(BackgroundsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_backgrounds, container, false);
        final TextView textView = root.findViewById(R.id.text_backgrounds);
        backgroundsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}