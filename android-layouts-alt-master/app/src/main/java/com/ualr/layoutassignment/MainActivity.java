package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    public double calculateTotal(){

    return 0.00;
    }
    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        
    }
}