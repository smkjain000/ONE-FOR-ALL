package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Third extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4,b5;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.button6);
        b3=(Button)findViewById(R.id.button7);
        b4=(Button)findViewById(R.id.button8);
        b5=(Button)findViewById(R.id.button9);
        ib=(ImageButton)findViewById(R.id.imageButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Third.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Fourth.class);
                startActivity(j);
                finish();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Third.this,Fifth.class);
                startActivity(k);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Third.this,Sixth.class);
                startActivity(l);
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Third.this,Seventh.class);
                startActivity(m);
                finish();
            }
        });

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Third.this,Tenth.class);
                startActivity(n);
                finish();
            }
        });
    }
}
