package com.example.backupbuttonactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayShowHomeEnabled(true);


        //Add logo in action bar

        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        //Showing tittle in action bar

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Action Bar");
    }

    public void ButtonClick(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
        Toast.makeText(MainActivity.this, "Going 2nd Acitvity", Toast.LENGTH_SHORT).show();
    }
}
