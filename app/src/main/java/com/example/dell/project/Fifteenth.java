package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Fifteenth extends AppCompatActivity {

    TextView t1;
    ImageButton ib;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteenth);

        t1=(TextView)findViewById(R.id.textView13);
        r1=(RadioButton)findViewById(R.id.radioButton17);
        r2=(RadioButton)findViewById(R.id.radioButton18);
        r3=(RadioButton)findViewById(R.id.radioButton19);
        r4=(RadioButton)findViewById(R.id.radioButton20);
        ib=(ImageButton)findViewById(R.id.imageButton6);

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

                Intent i=new Intent(Fifteenth.this,Sixteenth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
