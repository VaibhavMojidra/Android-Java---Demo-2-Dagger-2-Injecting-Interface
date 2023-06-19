package com.vaibhavmojidra.androidjavademo2dagger2injectinginterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerPlayGameComponent.create().getPlayGame().playGame();
    }
}