package com.example.finalproject_nayonikaroy_aiushemishra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.io.IOException;
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
        /*
        symptomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getSymptom();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        });*/
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
        Intent e = new Intent(this, Emergenciesclass.class);
        startActivity(e);
    }

    public void getCMA() {
        Intent u = new Intent(this, CMAclass.class);
        startActivity(u);
    }
/*
    public void getSymptom() throws IOException {
        Symptomclass x = new Symptomclass();
        x.onCreate(savedInstanceState);
    }*/
}