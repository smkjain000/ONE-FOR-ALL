package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sixteenth extends AppCompatActivity {

    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteenth);

        t1=(TextView)findViewById(R.id.textView14);
        b1=(Button)findViewById(R.id.button30);

        if(Eleventh.score>=10) {
            t1.setText("Congratulations,You are Qualified,Your Score is : " +Eleventh.score);
        }
        else
        {
            t1.setText("Sorry,You are not Qualified,Your Score is : " +Eleventh.score);
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sixteenth.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });
    }
}
