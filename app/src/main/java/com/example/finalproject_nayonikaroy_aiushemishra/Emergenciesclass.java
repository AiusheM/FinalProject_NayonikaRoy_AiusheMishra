package com.example.finalproject_nayonikaroy_aiushemishra;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Emergenciesclass extends AppCompatActivity {
    private static final int REQUEST_PHONE_CALL = 1;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergenciesclass);

        Button back = findViewById(R.id.Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getM();
            }
        });

        Button police = (Button) findViewById(R.id.police);

        police.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
//                Intent call = new Intent(Intent.ACTION_CALL);
//                call.setData(Uri.parse("tel:911"));

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "911"));// Initiates the Intent
                startActivity(intent);

//                if (ContextCompat.checkSelfPermission(Emergenciesclass.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(Emergenciesclass.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
//                }
//                else
//                {
//                    startActivity(call);
                //}
            }
        });

        Button nonEm = (Button) findViewById(R.id.nonEm);

        nonEm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2173338911"));// Initiates the Intent
                startActivity(intent);

//                Intent call = new Intent(Intent.ACTION_CALL);
//                call.setData(Uri.parse("tel:2173338911"));
//
//                if (ContextCompat.checkSelfPermission(Emergenciesclass.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(Emergenciesclass.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
//                }
//                else
//                {
//                    startActivity(call);
//                }
            }
        });

        Button emDean = (Button) findViewById(R.id.emDean);

        emDean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2173330050"));// Initiates the Intent
                startActivity(intent);

            }
        });
    }
    public void getM() {
        Intent e = new Intent(this, MainActivity.class);
        startActivity(e);
    }

}
