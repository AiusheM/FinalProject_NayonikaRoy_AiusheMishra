package com.example.finalproject_nayonikaroy_aiushemishra;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Symptomclass extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptomclass);

        Button back = findViewById(R.id.Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity call = new MainActivity();
                call.onCreate(savedInstanceState);
            }
        });

        /*
        WebApi.startRequest(this, WebApi.API_BASE + "/some/endpoint", response -> {
            // Code in this handler will run when the request completes successfully
            // Do something with the response?
        }, error -> {
            // Code in this handler will run if the request fails
            // Maybe notify the user of the error?
            Toast.makeText(this, "Oh no!", Toast.LENGTH_LONG).show();
        });

         */
    }

}
