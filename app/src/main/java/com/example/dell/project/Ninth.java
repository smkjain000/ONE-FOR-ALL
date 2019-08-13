package com.example.dell.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Ninth extends AppCompatActivity {

    Button b1,b2;
    EditText e1;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth2);

        b1 = (Button) findViewById(R.id.button26);
        b2 = (Button) findViewById(R.id.button27);
        e1 = (EditText) findViewById(R.id.editText10);
        w1 = (WebView) findViewById(R.id.webView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ninth.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                w1.loadUrl(s1);
            }
        });


      }
}
