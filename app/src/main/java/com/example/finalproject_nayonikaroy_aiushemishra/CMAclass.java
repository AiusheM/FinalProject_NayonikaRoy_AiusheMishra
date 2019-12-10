package com.example.finalproject_nayonikaroy_aiushemishra;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.util.Log;
import android.view.View;
import android.widget.Button;


public class CMAclass extends AppCompatActivity {
    private static final int REQUEST_PHONE_CALL = 1;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmaclass);

        Button back = findViewById(R.id.Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getM();
            }
        });

        Button McKinley = (Button) findViewById(R.id.McKinley);

        McKinley.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
//                Intent call = new Intent(Intent.ACTION_CALL);
//                call.setData(Uri.parse("tel:2173332700"));

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2173332700"));// Initiates the Intent
                startActivity(intent);

//                if (ContextCompat.checkSelfPermission(CMAclass.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(CMAclass.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
//                }
//                else
//                {
//                    startActivity(call);
                //}
            }
        });

        Button OSF = (Button) findViewById(R.id.OSF);

        OSF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2173372000"));// Initiates the Intent
                startActivity(intent);

//                Intent call = new Intent(Intent.ACTION_CALL);
//                call.setData(Uri.parse("tel:2173372000"));
//
//                if (ContextCompat.checkSelfPermission(CMAclass.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(CMAclass.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
//                }
//                else
//                {
//                    startActivity(call);
//                }
            }
        });

        Button Carle = (Button) findViewById(R.id.Carle);

        Carle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2173833311"));// Initiates the Intent
                startActivity(intent);

            }
        });
    }
    public void getM() {
        Intent e = new Intent(this, MainActivity.class);
        startActivity(e);
    }
}

//we may have to double check if this counts as an android feauture bc technically this is not calling