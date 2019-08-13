package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Thirteenth extends AppCompatActivity {

    TextView t1;
    RadioButton r1,r2,r3,r4;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);

        t1=(TextView)findViewById(R.id.textView11);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);
        ib=(ImageButton)findViewById(R.id.imageButton4);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                {
                    Eleventh.score=Eleventh.score+4;
                }
                else
                {
                    --Eleventh.score;
                }

                Intent i=new Intent(Thirteenth.this,Fourteenth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
