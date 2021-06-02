package com.example.android.mintcov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public void  btnClick(View view) {
    EditText dollarAmount = (EditText) findViewById(R.id.editTextTextPersonName);
    String dollars = dollarAmount.getText().toString();
    Double doubleDollars = Double.parseDouble(dollars);
    Double doubleINR = 74.44 * doubleDollars;
    String toastText = "= " + doubleINR.toString() + "INR";

    Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
    }