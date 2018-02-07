package com.sheygam.java_17_07_02_18_part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sheygam.java_17_07_02_18_part2.di.main.MainModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.get(this).plusMain(new MainModule()).inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        manager.onLogin();
        super.onStart();
    }
}
