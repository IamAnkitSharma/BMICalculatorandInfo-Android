package com.example.admin.bmicalculator;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView icon;
    MediaPlayer open;
    MediaPlayer tic;
    ImageView option1;
    ImageView option2;
    ImageView option3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icon=(ImageView)findViewById(R.id.icon);
        option1=(ImageView)findViewById(R.id.option1);
        option2=(ImageView)findViewById(R.id.option2);
       option3=(ImageView)findViewById(R.id.option3);

        open=MediaPlayer.create(this,R.raw.opening);
        tic=MediaPlayer.create(this,R.raw.tic);

        icon.animate().rotation(360).setDuration(5000);
        icon.animate().alpha(0).setDuration(5000);

        option1.animate().alpha(1).setDuration(7000);
        option2.animate().alpha(1).setDuration(7000);
        option3.animate().alpha(1).setDuration(7000);

        option1.animate().rotationY(360).setDuration(5000);
        option2.animate().rotationY(360).setDuration(5000);
        option3.animate().rotationY(360).setDuration(5000);

        open.start();

    }
    public void b1click(View v)
    {
        tic.start();
        Intent i = new Intent(this,about.class);
        startActivity(i);

    }
    public void b2click(View v)
    {
        tic.start();
        Intent i = new Intent(this,whatisbmi.class);
        startActivity(i);
    }
    public void b3click(View v)
    {
        tic.start();
        Intent i = new Intent(this,calculator.class);
        startActivity(i);
    }
}
