package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.ualr.layoutassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money
    public double calculateTotal(double value, double sum){
        sum=sum+value;
        return sum;
    }
    public double calculateDiscount(double sum){
        return sum*0.75;
    }
    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    //private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        super.onCreate(savedInstanceState);


        binding.calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                double sum=0.00;

                if (binding.product1Cbx.isChecked()) {
                   sum=calculateTotal(Double.parseDouble(binding.product1Ed.getText().toString()),sum);
                }
                if (binding.product2Cbx.isChecked()) {
                    sum=calculateTotal(Double.parseDouble(binding.product2Ed.getText().toString()),sum);
                }
                if (binding.product3Cbx.isChecked()) {
                    sum=calculateTotal(Double.parseDouble(binding.product3Ed.getText().toString()),sum);
                }
                if (binding.product4Cbx.isChecked()){
                    sum=calculateTotal(Double.parseDouble(binding.product4Ed.getText().toString()),sum);
                }

                if(binding.discountBtntog.isChecked())
                {
                    sum=calculateDiscount(sum);
                }

               binding.totalAmountVw.setText(String.valueOf(sum));
            }
        });







    }
}