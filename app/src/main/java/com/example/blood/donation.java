package com.example.blood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class donation extends AppCompatActivity {

    EditText d1,d2,d3,d4,d5;
    Spinner d6;
    Button d8;
    String name[]={"A+","B+","AB+","O+","A-","B-","AB-","O-"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        d2=(EditText)findViewById(R.id.d2);
        d3=(EditText)findViewById(R.id.d3);
        d4=(EditText)findViewById(R.id.d4);
        d5=(EditText)findViewById(R.id.d5);
        d6=(Spinner) findViewById(R.id.d6);
        d8 =(Button)findViewById(R.id.d8);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,name);
        d6.setAdapter(arrayAdapter);

        d6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(donation.this, "Blood group:"+name[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(donation.this, "Thank you for donating you saved one life", Toast.LENGTH_SHORT).show();
            }
        });
        }

    }

