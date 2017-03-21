package com.example.yo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioButton rb1, rb2;
    Button b1;
    ImageView man, woman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example2);
        init();

    }
    void init(){
        b1 = (Button)findViewById(R.id.b1);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        man = (ImageView)findViewById(R.id.man);
        woman = (ImageView)findViewById(R.id.woman);

        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    man.setVisibility(View.VISIBLE);
                    woman.setVisibility(View.GONE);
                }

            }
        });
        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    man.setVisibility(View.GONE);
                    woman.setVisibility(View.VISIBLE);
                }
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "당신은 남성입니다.", Toast.LENGTH_SHORT).show();
                }
                if(rb2.isChecked()){
                    Toast.makeText(getApplicationContext(), "당신은 여성입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

