package com.example.blood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText r1,r2,r3,r4;
    Button r5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        r1=(EditText)findViewById(R.id.d2);
        r2=(EditText)findViewById(R.id.r2);
        r3=(EditText)findViewById(R.id.r3);
        r4=(EditText)findViewById(R.id.r4);
        r5=(Button)findViewById(R.id.r5);

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String password = r3.getText().toString().trim();
                String cnf_password = r3.getText().toString().trim();

                if (password.equals(cnf_password)) {

                    Toast.makeText(register.this, "You have registered", Toast.LENGTH_SHORT).show();
//                    Intent i = new Intent(register.this, login.class);
//                    startActivity(i);
                } else {
                    Toast.makeText(register.this, "Password is not matching", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
