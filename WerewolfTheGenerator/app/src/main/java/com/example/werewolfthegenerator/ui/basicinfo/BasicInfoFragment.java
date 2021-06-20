package com.example.werewolfthegenerator.ui.basicinfo;

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
import com.example.werewolfthegenerator.ui.dashboard.DashboardViewModel;

public class BasicInfoFragment extends Fragment {

    private BasicInfoViewModel basicInfoViewModel;

    public static BasicInfoFragment newInstance() {
        return new BasicInfoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        basicInfoViewModel =
                new ViewModelProvider(this).get(BasicInfoViewModel .class);
        View root = inflater.inflate(R.layout.basic_info_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        basicInfoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}