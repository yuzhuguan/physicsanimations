package com.codef1.physicsanimations.animation;

import android.support.animation.DynamicAnimation;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.view.View;

/**
 * Created by yuzhu on 2017/12/25.
 */

public class SpringAnimationUtil {

    public static SpringAnimation createSpringAnimation(View view,
                                                        DynamicAnimation.ViewProperty property,
                                                        float finalPosition,
                                                        float stiffness,
                                                        float dampingRatio) {
        SpringAnimation animation = new SpringAnimation(view, property);
        SpringForce springForce = new SpringForce(finalPosition);
        springForce.setStiffness(stiffness);
        springForce.setDampingRatio(dampingRatio);
        animation.setSpring(springForce);
        return animation;
    }
}
