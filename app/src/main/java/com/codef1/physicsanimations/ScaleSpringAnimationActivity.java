package com.codef1.physicsanimations;

import android.app.Activity;
import android.os.Bundle;
import android.support.animation.FloatPropertyCompat;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.codef1.physicsanimations.animation.ScaleSpringAnimation;

/**
 * Created by yuzhu on 2017/12/25.
 */

public class ScaleSpringAnimationActivity  extends AppCompatActivity {

    private static final String TAG = TranslateSpringAnimationActivity.class.getSimpleName();

    private SpringAnimation mSpringTranslationXAnimation;
    private SpringAnimation mSpringTranslationYAnimation;

    private ImageView mViewToBeAnimated;
    private float mXDiffInTouchPointAndViewTopLeftCorner;
    private float mYDiffInTouchPointAndViewTopLeftCorner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translate_spring_animation_activity);

        mViewToBeAnimated = (ImageView) findViewById(R.id.iv_translate_spring);
        ScaleSpringAnimation scaleSpringAnimation =
                new ScaleSpringAnimation(mViewToBeAnimated, null);
    }
}
