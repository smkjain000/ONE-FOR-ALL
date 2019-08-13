package com.example.dell.project;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;

public class Tenth extends AppCompatActivity {

    Button b1;
    TextView t1,t2;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);

        b1=(Button)findViewById(R.id.button28);
        t1=(TextView)findViewById(R.id.textView6);
        t2=(TextView)findViewById(R.id.textView7);
        ib=(ImageButton)findViewById(R.id.imageButton7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Tenth.this,Third.class);
                startActivity(i);
                finish();
            }
        });

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationInfo api = getApplicationContext().getApplicationInfo();

                String apkPath=api.sourceDir;

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("android/vnd.android.package-archive");

                intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkPath)));
                startActivity(Intent.createChooser(intent,"Share app using"));
            }
        });
    }
}
