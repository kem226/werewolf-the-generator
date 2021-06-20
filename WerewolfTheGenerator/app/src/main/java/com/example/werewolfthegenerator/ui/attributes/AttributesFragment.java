package com.example.werewolfthegenerator.ui.attributes;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.werewolfthegenerator.R;
import com.example.werewolfthegenerator.ui.basicinfo.BasicInfoViewModel;

public class AttributesFragment extends Fragment {

    private AttributesViewModel attributesViewModel;

    public static AttributesFragment newInstance() {
        return new AttributesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        attributesViewModel =
                new ViewModelProvider(this).get(AttributesViewModel.class);
        View root = inflater.inflate(R.layout.basic_info_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        attributesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}