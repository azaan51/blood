package com.example.blood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity {
    EditText h1,h2;
    Button h3,h4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        h1=(EditText)findViewById(R.id.h1);
        h2=(EditText)findViewById(R.id.h2);
        h3=(Button)findViewById(R.id.h3);
        h4 =(Button)findViewById(R.id.h4);



        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(home.this,donation.class);
                startActivity(i);
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(home.this,history.class);
                startActivity(j);
            }
        });
    }
}
