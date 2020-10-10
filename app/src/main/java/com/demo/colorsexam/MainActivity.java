package com.demo.colorsexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textViewFindDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.SpinnerColors);
        textViewFindDescription = findViewById(R.id.textViewFindDescription);
    }

    public void setDescription(View view) {
        int position;
        position = spinnerColors.getSelectedItemPosition();
        String description = viewDescription(position);
        textViewFindDescription.setText(description);
        
    }

    public String viewDescription (int position) {
        String [] desc = getResources().getStringArray(R.array.Description);
        return desc[position];
    }
}

testTest
fasf