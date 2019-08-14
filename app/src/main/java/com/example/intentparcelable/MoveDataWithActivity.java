package com.example.intentparcelable;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MoveDataWithActivity extends AppCompatActivity {
    public static String EXTRA_AGE = "extra age";
    public static String EXTRA_NAME = "extra name";
    private TextView tvDataRecieved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataRecieved = (TextView) findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Name : " + name + ", Your Age : " + age;
        tvDataRecieved.setText(text);

    }
}