package com.example.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);


        // Getting the initial Count
        textView.setText("You Clicked Me: "+ mainActivityViewModel.getInitialCounter()+ " times");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Getting the Current Count
                textView.setText("You Clicked Me: "+ mainActivityViewModel.getCounter() +" times");
            }
        });
    }
}