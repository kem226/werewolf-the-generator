package com.example.werewolfthegenerator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newCharacter = findViewById(R.id.btn_new_character);

        newCharacter.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, NavigationActivity.class));
        });

    }
}