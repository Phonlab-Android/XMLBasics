package com.example.xmlbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    //When the app launches, do everything in between the brackets
    protected void onCreate(Bundle savedInstanceState) {
        //Do some background things the same way as usual
        super.onCreate(savedInstanceState);
        //Set the apps screen to the layout activity_main
        setContentView(R.layout.second_layout);
    }
}
