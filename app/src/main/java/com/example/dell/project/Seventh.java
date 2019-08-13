package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seventh extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        b1=(Button)findViewById(R.id.button21);
        b2=(Button)findViewById(R.id.button22);
        b3=(Button)findViewById(R.id.button23);
        b4=(Button)findViewById(R.id.button24);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Seventh.this,Third.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Seventh.this,Eight.class);
                startActivity(j);
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Seventh.this,Ninth.class);
                startActivity(k);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Seventh.this,Eleventh.class);
                startActivity(l);
                finish();
            }
        });
    }
}
