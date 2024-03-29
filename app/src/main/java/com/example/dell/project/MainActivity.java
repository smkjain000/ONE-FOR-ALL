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

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Second.class);
                startActivity(i);
                finish();

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                if (s1.equals("")||s2.equals(""))
                {

                    Toast.makeText(MainActivity.this,"Please fill all details",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase db=openOrCreateDatabase("Project",MODE_PRIVATE,null);
                    db.execSQL("CREATE TABLE IF NOT EXISTS Login_details(Username varchar,Password varchar,Email varchar,City varchar,Phone int);");
                    String s3="Select * from Login_details where Username='"+s1+"' AND Password='"+s2+"'";

                    Cursor cursor=db.rawQuery(s3,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(MainActivity.this,Third.class);
                        startActivity(j);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Sorry you are not registered",Toast.LENGTH_SHORT).show();
                        Intent k=new Intent(MainActivity.this,Second.class);
                        startActivity(k);
                        finish();
                        cursor.close();
                    }
                }
            }
        });
    }
}
