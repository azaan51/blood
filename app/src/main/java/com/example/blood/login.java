package com.example.blood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText l1,l2;
    Button l3,l4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        l1=(EditText)findViewById(R.id.l1);
        l2=(EditText)findViewById(R.id.l2);
        l3=(Button)findViewById(R.id.l3);
        l4 =(Button)findViewById(R.id.l4);



        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login.this,home.class);
                startActivity(i);
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(login.this,register.class);
                startActivity(j);
            }
        });


    }
}
