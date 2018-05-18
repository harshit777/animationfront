package com.example.hg.animationcheck;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    RelativeLayout l1,l2;
    Button buttons;
    Animation uptown, downtown,rock;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons = findViewById(R.id.buttonsub);
        l1 =  findViewById(R.id.l1);
        l2 =  findViewById(R.id.l2);
        //imageView = findViewById(R.id.imageView);
        uptown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtown = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        rock = AnimationUtils.loadAnimation(this,R.anim.rock);
        l1.setAnimation(uptown);
        l2.setAnimation(downtown);


    }
}
