package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Eleventh extends AppCompatActivity {
    Button b1;
    TextView t1,t2;
    RadioButton r1,r2,r3,r4;
    ImageButton ib;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);

        b1=(Button)findViewById(R.id.button29);
        t1=(TextView)findViewById(R.id.textView8);
        t2=(TextView)findViewById(R.id.textView9);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        ib=(ImageButton)findViewById(R.id.imageButton2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Eleventh.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r3.isChecked())
                {
                    score=score+4;
                }
                else
                {
                 --score;
                }

                Intent j=new Intent(Eleventh.this,Tweleveth.class);
                startActivity(j);
                finish();
            }
        });


    }
}
