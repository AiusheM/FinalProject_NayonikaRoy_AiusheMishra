package com.example.finalproject_nayonikaroy_aiushemishra;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.nio.channels.Selector;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final Bundle savedInstanceState = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button emergenciesButton = findViewById(R.id.EmergenciesButton);
        Button cmaButton = findViewById(R.id.CMAButton);
        Button symptomButton = findViewById(R.id.SymptomButton);

        emergenciesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEmergencies();
            }
        });
        cmaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCMA();
            }
        });
        symptomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSymptom();
            }
        });
    }
/*
    public void getEmergencies() {
        Log.i("My App", "This is an getEmergencies");
    }
    public void getCMA() {
        Log.i("My App", "This is an getCMA");
    }
    public void getSymptom() {
        Log.i("My App","This is an getSymptom");
    }
    */

    public void getEmergencies() {
        Emergenciesclass e = new Emergenciesclass();
        e.onCreate(savedInstanceState);
    }

    public void getCMA() {
        CMAclass u = new CMAclass();
        u.onCreate(savedInstanceState);
    }

    public void getSymptom() {
        Symptomclass x = new Symptomclass();
        x.onCreate(savedInstanceState);
    }
}