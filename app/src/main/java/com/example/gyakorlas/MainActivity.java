package com.example.gyakorlas;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText textArea;
    TextView result;
    Button uppercase;
    Button lowercase;
    Button randomColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        uppercase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textArea.getText().toString();
                result.setText(text.toUpperCase());
            }
        });
        lowercase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textArea.getText().toString();
                result.setText(text.toLowerCase());
            }
        });
        randomColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int colour = Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                result.setBackgroundColor(colour);
            }
        });
    }

    private void init() {
        textArea = findViewById(R.id.input);
        result = findViewById(R.id.output);
        uppercase = findViewById(R.id.uppercaseButton);
        lowercase = findViewById(R.id.lowercaseButton);
        randomColour = findViewById(R.id.randomColour);
    }
}