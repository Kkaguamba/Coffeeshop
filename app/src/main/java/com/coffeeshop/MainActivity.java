package com.coffeeshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     TextView  numberofcoffee,txt_total,order;
     Button btnminus,btnplus;
     CheckBox cappubox,lattbox,espresbox,americbox;

     int price = 120,total =0,numofcofee = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberofcoffee = findViewById(R.id.num);
        btnminus = findViewById(R.id.btnMinus);
        btnplus = findViewById(R.id.btnPlus);
        numberofcoffee.setText(String.valueOf(numofcofee));
        txt_total = findViewById(R.id.txt_total);
        order = findViewById(R.id.order);
        cappubox = findViewById(R.id.cappubox);
        espresbox = findViewById(R.id.espresbox);
        lattbox = findViewById(R.id.lattbox);
        americbox = findViewById(R.id.americbox);

    }

    public void btn_plus(View view){
        numofcofee++;
        total=numofcofee*price;

        Toast.makeText(getApplicationContext(), "Number of coffee =:" + numofcofee+"Total price = "+total, Toast.LENGTH_SHORT).show();
        txt_total.setText("Number of coffee =:" + numofcofee + "Total price = " + total);

        numberofcoffee.setText(String.valueOf(numofcofee));




    }
    public void btn_minus(View view) {
        if (numofcofee < 1) {
            Toast.makeText(getApplicationContext(), "no order placed", Toast.LENGTH_SHORT).show();
        } else {
            numofcofee--;
            total = numofcofee * price;

            Toast.makeText(getApplicationContext(), "Number of coffee :" + numofcofee + "Total price /= " + total, Toast.LENGTH_SHORT).show();
            txt_total.setText("Number of coffee :" + numofcofee + "Total price /= " + total);

            numberofcoffee.setText(String.valueOf(numofcofee));


        }
    }
    public  void onCheckboxClicked(View view){




    }


}