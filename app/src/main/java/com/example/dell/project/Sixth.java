package com.example.dell.project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sixth extends AppCompatActivity {

    Button b1,b2;
    ImageView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        b1=(Button)findViewById(R.id.button19);
        b2=(Button)findViewById(R.id.button20);
        w1=(ImageView)findViewById(R.id.imageView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sixth.this,Third.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(k,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b=(Bitmap)data.getExtras().get("data");
        w1.setImageBitmap(b);
    }

}
