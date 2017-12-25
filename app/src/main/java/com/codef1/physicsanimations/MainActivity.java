package com.codef1.physicsanimations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button translateSpringAnimBtn = (Button) findViewById(R.id.btn_translate_spring);
        translateSpringAnimBtn.setOnClickListener(this);

        Button flingAnimBtn = (Button) findViewById(R.id.btn_translate_fling);
        flingAnimBtn.setOnClickListener(this);

        Button translateRotateSpringAnimBtn = (Button) findViewById(R.id.btn_translate_rotate_spring);
        translateRotateSpringAnimBtn.setOnClickListener(this);

        Button chainedSpringAnimBtn = (Button) findViewById(R.id.btn_chained_spring);
        chainedSpringAnimBtn.setOnClickListener(this);

        Button scaleSpringAnimBtn = (Button) findViewById(R.id.btn_scale);
        scaleSpringAnimBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.btn_translate_spring) {
            intent = new Intent(this, TranslateSpringAnimationActivity.class);
            startActivity(intent);
        } else if (id == R.id.btn_translate_fling) {
            intent = new Intent(this, TranslateFlingAnimationActivity.class);
            startActivity(intent);
        } else if (id == R.id.btn_translate_rotate_spring) {
            intent = new Intent(this, TranslateAndRotateSpringAnimationActivity.class);
            startActivity(intent);
        } else if (id == R.id.btn_chained_spring) {
            intent = new Intent(this, ChainedSpringAnimationActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_scale) {
            intent = new Intent(this, ScaleSpringAnimationActivity.class);
            startActivity(intent);
        }
    }
}
