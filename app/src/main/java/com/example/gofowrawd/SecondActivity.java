package com.example.gofowrawd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "SharedPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SharedPreferences storedData = getSharedPreferences(PREFS_NAME, 0);
        String userName = storedData.getString("userName", null);
        TextView textView = findViewById(R.id.username);
        textView.setText(userName);
    }

    public void goThird(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }

}