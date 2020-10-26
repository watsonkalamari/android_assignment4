package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.ualr.layoutassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    public String calculateTotal(double prod1){

        String returnedSum;
        double sum;
        sum=+prod1;
       returnedSum= String.valueOf(sum);
    return returnedSum;
    }
    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    double product1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);


        binding.calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                product1=Double.parseDouble(binding.product1Ed.getText().toString());

                binding.totalAmountVw.setText(calculateTotal(product1));
            }
        });







    }
}