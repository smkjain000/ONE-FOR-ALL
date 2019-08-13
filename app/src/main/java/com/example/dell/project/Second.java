package com.example.dell.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e1 = (EditText) findViewById(R.id.editText3);
        e2 = (EditText) findViewById(R.id.editText4);
        e3 = (EditText) findViewById(R.id.editText5);
        e4 = (EditText) findViewById(R.id.editText6);
        e5 = (EditText) findViewById(R.id.editText7);
        b1 = (Button) findViewById(R.id.button3);
        b2 = (Button) findViewById(R.id.button4);
        t1 = (TextView)findViewById(R.id.textView15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Second.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();

                if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("")) {
                    Toast.makeText(Second.this, "Please fill all details", Toast.LENGTH_SHORT).show();
                } else {
                    SQLiteDatabase db = openOrCreateDatabase("Project", MODE_PRIVATE, null);

                    db.execSQL("CREATE TABLE IF NOT EXISTS Login_details(Username varchar,Password varchar,Email varchar,City varchar,Phone int);");

                    String s6 = "Select * from Login_details where username='"+ s1 +"' AND email='"+ s3 +"'";

                    Cursor cursor = db.rawQuery(s6, null);

                    if (cursor.getCount()>0) {
                        Toast.makeText(Second.this, "User already exists", Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(Second.this, MainActivity.class);
                        startActivity(j);
                        finish();
                    } else {
                        db.execSQL("INSERT INTO Login_details VALUES('"+ s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"');");
                        Toast.makeText(Second.this, "Database updated", Toast.LENGTH_SHORT).show();
                        Intent k = new Intent(Second.this, MainActivity.class);
                        startActivity(k);
                        finish();
                        cursor.close();
                    }
                }
            }

        });
    }




}
