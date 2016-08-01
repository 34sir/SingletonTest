package com.example.chukc.singletontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SingleTon singleTon=SingleTon.getInstanse();
        SingleTon singleTon1=SingleTon.getInstanse();
        Log.i("SingleTon","singleTon==="+singleTon+"====singleTon1==="+singleTon1);
    }
}
