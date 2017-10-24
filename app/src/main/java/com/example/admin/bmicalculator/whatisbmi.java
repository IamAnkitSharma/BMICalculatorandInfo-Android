package com.example.admin.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class whatisbmi extends AppCompatActivity {
TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatisbmi);
        info=(TextView)findViewById(R.id.textView7);
        info.animate().rotationBy(360).setDuration(2000);
        info.animate().alpha(1).setDuration(2000);

    }
}
