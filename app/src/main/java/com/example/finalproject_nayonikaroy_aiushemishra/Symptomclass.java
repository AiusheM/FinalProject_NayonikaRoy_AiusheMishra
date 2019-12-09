package com.example.finalproject_nayonikaroy_aiushemishra;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

import org.json.JSONObject;

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

public class Symptomclass extends AppCompatActivity {

    public Symptomclass() throws IOException {
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptomclass);
// hi nayo
        Button back = findViewById(R.id.Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity call = new MainActivity();
                call.onCreate(savedInstanceState);
            }
        });


    }

    //this is the method for getting a request

    public static void getRequest() throws IOException {

        //Created a URL variable
        URL url = new URL("https://api.nhs.uk/search/?query={query}");
        //checks to see if the input/textbox is empty
        String readLine = null;
        //creates a conection object
        HttpURLConnection conection = (HttpURLConnection) url.openConnection();
        //creates a GET request
        conection.setRequestMethod("GET");

        conection.setHeader("bd4c6c19afb54978a81edcbc60fe0d9d", "{bd4c6c19afb54978a81edcbc60fe0d9d}");

        conection.setRequestProperty("userId", "a1bcdef"); // CHANGE

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
    }
}
