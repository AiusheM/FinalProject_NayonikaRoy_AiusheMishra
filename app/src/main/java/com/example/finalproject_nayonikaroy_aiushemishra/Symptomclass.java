package com.example.finalproject_nayonikaroy_aiushemishra;

import android.content.Intent;
import android.os.Bundle;
import java.util.Scanner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.net.URI;


public class Symptomclass extends AppCompatActivity {

    public Symptomclass() {
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptomclass);

        Button back = findViewById(R.id.Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getM();
            }
        });

        Button calculate = findViewById(R.id.calc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });

    }
/*
    //this is the method for getting a request

    public static void getRequest() throws IOException {

        //Created a URL variable
        // this is the api url
        URL url = new URL("https://sandbox-healthservice.priaid.ch/diagnosis?symptoms=[9]&gender=female&year_of_birth=2001&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImFpdXNoZW1AZ21haWwuY29tIiwicm9sZSI6IlVzZXIiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9zaWQiOiI2MTg2IiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy92ZXJzaW9uIjoiMjAwIiwiaHR0cDovL2V4YW1wbGUub3JnL2NsYWltcy9saW1pdCI6Ijk5OTk5OTk5OSIsImh0dHA6Ly9leGFtcGxlLm9yZy9jbGFpbXMvbWVtYmVyc2hpcCI6IlByZW1pdW0iLCJodHRwOi8vZXhhbXBsZS5vcmcvY2xhaW1zL2xhbmd1YWdlIjoiZW4tZ2IiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL2V4cGlyYXRpb24iOiIyMDk5LTEyLTMxIiwiaHR0cDovL2V4YW1wbGUub3JnL2NsYWltcy9tZW1iZXJzaGlwc3RhcnQiOiIyMDE5LTEyLTA5IiwiaXNzIjoiaHR0cHM6Ly9zYW5kYm94LWF1dGhzZXJ2aWNlLnByaWFpZC5jaCIsImF1ZCI6Imh0dHBzOi8vaGVhbHRoc2VydmljZS5wcmlhaWQuY2giLCJleHAiOjE1NzU5MzIxOTAsIm5iZiI6MTU3NTkyNDk5MH0.YtB85pU78VkxQ_jTc3gKkcL3FWyJRpOr9rmBZDnrVgQ&format=json&language=en-gb");

        //checks to see if the input/textbox is empty
        String readLine = null;
        //creates a conection object
        HttpURLConnection conection = (HttpURLConnection) url.openConnection();
        //creates a GET request
        conection.setRequestMethod("GET");

        conection.setRequestProperty("Aiushe", "Nayo123"); //login info

        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();

            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            }
            in.close();
            // print result
            //System.out.println("JSON String Result " + response.toString());
        } else {
            System.out.println("GET NOT WORKED");
        }
    }*/
public void getM() {
    Intent e = new Intent(this, MainActivity.class);
    startActivity(e);
}

    // BMI Calculator in Java
// Uses metric units
private void calculateBMI() {
    EditText w = findViewById(R.id.w);
    EditText h = findViewById(R.id.h);

    int he = Integer.parseInt(w.getText().toString());
    int we = Integer.parseInt(h.getText().toString());
    System.out.println(we + " input " + he);
    double mul = he*he;
    int num = 703*we;
    System.out.println(mul + " input " + num);
    double BMI = num/mul;
    System.out.println(BMI + "message");
    TextView tv = findViewById(R.id.tv);

    Log.i("error", "" + BMI);
    tv.setText(""+BMI);

}
}
