package com.example.admin.bmicalculator;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class calculator extends AppCompatActivity {
    EditText weight;
    EditText height;
TextView status;

    TextView lbl1;
    TextView lbl2;
    TextView lbl3;

    Button btn;
    ImageView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        weight=(EditText)findViewById(R.id.weight);
        height=(EditText)findViewById(R.id.height);
        status=(TextView)findViewById(R.id.status);
        header=(ImageView)findViewById(R.id.header);
        btn=(Button)findViewById(R.id.button) ;
        lbl1=(TextView)findViewById(R.id.lbl1);
        lbl2=(TextView) findViewById(R.id.lbl2);
        lbl3=(TextView)findViewById(R.id.lbl3);


        weight.requestFocus();

        header.animate().alpha(1).setDuration(3000);
        lbl1.animate().alpha(1).setDuration(3000);
        lbl2.animate().alpha(1).setDuration(3000);
        lbl3.animate().alpha(1).setDuration(3000);

        weight.animate().alpha(1).setDuration(3000);
        height.animate().alpha(1).setDuration(3000);
        btn.animate().alpha(1).setDuration(3000);
        status.animate().alpha(1).setDuration(3000);


    }
    public void calculate(View v)
    {
        MediaPlayer tic = MediaPlayer.create(this,R.raw.tic);
        tic.start();
        Float w = Float.parseFloat(weight.getText().toString());
        Float h= Float.parseFloat(height.getText().toString());
            Float bmi = w / (h * h);


           if (bmi < 18.5) {
               status.setTextColor(Color.RED);
               status.setText(" Your BMI is " + bmi + "\n Status- Underweight");
               Toast.makeText(this, "Ohh !! You are Underweight", Toast.LENGTH_SHORT).show();
           }
           if (bmi > 18.5 && bmi < 24.9) {
               status.setTextColor(Color.GREEN);
               status.setText(" Your BMI is " + bmi + "\n Status- Normal");
               Toast.makeText(this, "Dont Worry Your weight is normal ", Toast.LENGTH_SHORT).show();
           }
           if (bmi > 25 && bmi < 29.9) {
               status.setTextColor(Color.RED);
               status.setText(" Your BMI is " + bmi + "\n Status- OverWeight");
               Toast.makeText(this, "Ohh !! You are Overweightweight", Toast.LENGTH_SHORT).show();
           }
           if (bmi >= 30) {
               status.setTextColor(Color.RED);
               status.setText(" Your BMI is " + bmi + "\n Status- Obese");
               Toast.makeText(this, "Ohh !! Obese", Toast.LENGTH_SHORT).show();
           }

    }
}
