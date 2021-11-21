package com.example.myjavaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life cycle event", "onCreate()");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle event", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle event", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle event", "onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle event", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle event", "onDestroy()");
    }
    @Override
    protected  void  onRestart(){
        super.onRestart();
        Log.d("Life cycle event", "onRestart()");
    }
}