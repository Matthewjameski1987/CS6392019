package com.example.mommabearapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BillsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills);
    }

    public void calcTotal(View view) {

        EditText textView1, textView2, textView3, textView4;
        String s1, s2, s3, s4;
        Double d1, d2, d3, d4;
        double total;

        textView1 = findViewById(R.id.textView21);
        textView2 = findViewById(R.id.textView23);
        textView3 = findViewById(R.id.textView25);
        textView4 = findViewById(R.id.textView28);

        s1 = textView1.getText().toString();
        s2 = textView2.getText().toString();
        s3 = textView3.getText().toString();
        s4 = textView4.getText().toString();

        d1 = Double.valueOf(s1).doubleValue();
        d2 = Double.valueOf(s2).doubleValue();
        d3 = Double.valueOf(s3).doubleValue();
        d4 = Double.valueOf(s4).doubleValue();

        total = d1 + d2 + d3 + d4;
        String totalString = String.valueOf(total);

        TextView totalText = findViewById(R.id.textViewTotal);
        totalText.setText(totalString);

    }
}
