package com.example.dell.project;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eight extends AppCompatActivity implements SensorEventListener {

    Button b1;
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        b1=(Button)findViewById(R.id.button25);

        mp=MediaPlayer.create(this,R.raw.s);

        sm=(SensorManager)getSystemService(SENSOR_SERVICE);

        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);

        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Eight.this,Seventh.class);
                startActivity(i);
                finish();
            }
        });
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0] > 3)
                 {

                     mp.start();

                 }
        else
        {
            mp.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

