package com.example.deepaksingh_ceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    
        Toast.makeText(this, "onCreate are executed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart are executed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Toast.makeText(this, "onStop are executed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy are executed", Toast.LENGTH_LONG).show();
    }
}