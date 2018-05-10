package com.manoranjank.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int x,y;
    Button m1,m2,m5,m10,mR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mTextView;
        mTextView=(TextView) findViewById(R.id.textView);
        m1=(Button) findViewById(R.id.button);
        m2=(Button) findViewById(R.id.button2);
        m5=(Button) findViewById(R.id.button3);
        m10=(Button) findViewById(R.id.button4);
        mR=(Button) findViewById(R.id.button5);


        final RelativeLayout mLayout;
        mLayout=(RelativeLayout) findViewById(R.id.mano);
        Random mRandom=new Random();
        x=mRandom.nextInt(50);
        y=x;
        mTextView.setText(Integer.toString(x));



        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((x-1)>=0)
                {
                x=x-1;
                mTextView.setText(Integer.toString(x));}
                else if(x==0){
                  mLayout.setBackgroundColor(Color.RED);
                    mTextView.setText("PAID");
            }


            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((x-2)>=0) {
                x=x-2;
                mTextView.setText(Integer.toString(x));}
                else if(x==0){
                    mLayout.setBackgroundColor(Color.RED);
                    mTextView.setText("PAID");
                }


            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((x-5)>=0) {
                x=x-5;
                mTextView.setText(Integer.toString(x));}
                else if(x==0){
                    mLayout.setBackgroundColor(Color.RED);
                    mTextView.setText("PAID");
                }

            }
        });
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((x-10)>=0) {
                x=x-10;
                mTextView.setText(Integer.toString(x)); }
                else if(x==0){
                    mLayout.setBackgroundColor(Color.RED);
                    mTextView.setText("PAID");
                }
            }
        });

        mR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     x=y;

                    mTextView.setText(Integer.toString(x));
                mLayout.setBackgroundColor(Color.WHITE);

                ;
                }

        });







    }
}
