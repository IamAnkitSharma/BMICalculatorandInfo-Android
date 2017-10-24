package com.example.admin.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.admin.bmicalculator.R.id.lbl1;

public class about extends AppCompatActivity {
ImageView image;
    TextView lb1l;
    TextView lb12;
    TextView lb13;
    TextView lb14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

       lb1l=(TextView)findViewById(lbl1);
        lb12=(TextView)findViewById(R.id.lbl2);
        lb13=(TextView)findViewById(R.id.lbl3);
        lb14=(TextView)findViewById(R.id.lbl4);


        image=(ImageView)findViewById(R.id.image);
        image.animate().alpha(1).setDuration(2000);
        image.animate().rotationY(360).setDuration(2000);

       lb1l.animate().rotationY(360).setDuration(2000);
        lb12.animate().rotationY(360).setDuration(2000);
        lb13.animate().rotationY(360).setDuration(2000);
        lb14.animate().rotationY(360).setDuration(2000);

       lb1l.animate().alpha(1).setDuration(2000);
        lb12.animate().alpha(1).setDuration(2000);
        lb13.animate().alpha(1).setDuration(2000);
        lb14.animate().alpha(1).setDuration(2000);

    }


}
