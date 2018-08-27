package com.example.android.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Here we have created an object TextView and calling methods on it and in the onCreate method
     * we just setContentView to textView variable of TextView oject and followed by methods on java
     * object
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Hi there");
        textView.setTextSize(40);
        setContentView(textView);
        textView.setTextColor(Color.CYAN);
    }
}
