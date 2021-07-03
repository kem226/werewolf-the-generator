package com.example.werewolfthegenerator.ui.gifts;

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

public class GiftsFragment extends Fragment {

    private GiftsViewModel giftsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        giftsViewModel =
                new ViewModelProvider(this).get(GiftsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gifts, container, false);
        final TextView textView = root.findViewById(R.id.text_gifts);
        giftsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}