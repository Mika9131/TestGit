package com.gitprojekt.mika.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.SQLOutput;

// hallo dies ist ein test

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("TEST");
    }
}
