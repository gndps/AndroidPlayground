package com.kolshop.androidplayground;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    public void method_triggered_from_UI_thread(View v) {
    //public void method_triggered_from_UI_thread() { <--old method

        // Inflate other layout...
        View view = View.inflate(this, R.layout.activity_main, null);
        setContentView(view);
        ImageView btn = (ImageView) findViewById(R.id.my_bnt);
    }

    public void Next(View v) {
        setContentView(R.layout.layout2);
    }

}
