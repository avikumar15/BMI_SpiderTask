package com.example.bmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    EditText w, h;
    Button Sub, subb;
    TextView verdict, BMI, second, hitthor;
    String height,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w = (EditText) findViewById(R.id.weightt);
        h = (EditText) findViewById(R.id.heightt);

        Sub = (Button) findViewById(R.id.Sub);
        subb= (Button) findViewById(R.id.subb);

        verdict = (TextView) findViewById(R.id.verdict);
        BMI = (TextView) findViewById(R.id.BMI);
        second = (TextView) findViewById(R.id.second);
        hitthor = (TextView) findViewById(R.id.hitthor);


        height=h.getText().toString();
        weight=w.getText().toString();
        second.setVisibility(View.INVISIBLE);
        subb.setVisibility(View.INVISIBLE);

    }

    public void calc(View view) {

        Sub.setVisibility(View.INVISIBLE);
        hitthor.setVisibility(View.INVISIBLE);
        second.setVisibility(View.VISIBLE);
        subb.setVisibility(View.VISIBLE);

        float i=0;
        float j=0;

        if(!(h.getText().toString()).equals(""))
            i = Integer.parseInt(w.getText().toString());
        if(!(h.getText().toString()).equals(""))
            j = Integer.parseInt(h.getText().toString());


        if(i==0||j==0)
        {
            BMI.setText("INVALID INPUT.");
        }
        else {
            float ans = (10000 * i / (j * j));

            DecimalFormat abc = new DecimalFormat("#.##");

            BMI.setText("Your BMI is... " + abc.format(ans));

            if (ans <= 18.5)
                verdict.setText("Underweight");
            else if (ans <= 25)
                verdict.setText("Healthy");
            else if (ans <= 30)
                verdict.setText("Overweight");
            else
                verdict.setText("Obese");
        }
    }

    public void calc2(View v)
    {

        float i = 0;
        float j = 0;

        if(!(h.getText().toString()).equals(""))
            i = Integer.parseInt(w.getText().toString());
        if(!(h.getText().toString()).equals(""))
            j = Integer.parseInt(h.getText().toString());

        if(i==0||j==0)
        {
            BMI.setText("INVALID INPUT.");
        }

        float ans=(10000*i/(j*j));

        DecimalFormat abc = new DecimalFormat("#.##");

        BMI.setText("Your BMI is... "+abc.format(ans));

        if(ans<=18.5)
            verdict.setText("Underweight");
        else if(ans<=25)
            verdict.setText("Healthy");
        else if(ans<=30)
            verdict.setText("Overweight");
        else
            verdict.setText("Obese");
    }
}
