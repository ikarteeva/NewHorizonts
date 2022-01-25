package com.example.apptry;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nobut = findViewById(R.id.nobut);
        nobut.setOnClickListener(view -> Toast.makeText(MainActivity.this, R.string.uncorrect, Toast.LENGTH_LONG).show());
        Button yesbut = findViewById(R.id.yesbut);
        yesbut.setOnClickListener(view -> Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_LONG).show());

    }


}