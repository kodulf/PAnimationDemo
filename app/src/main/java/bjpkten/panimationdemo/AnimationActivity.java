package bjpkten.panimationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {

    TextView good_TV,addOne_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);


        addOne_TV = (TextView)findViewById(R.id.addOne_tv);
        good_TV = (TextView)findViewById(R.id.good_tv);


    }

    /**
     * 动态代码添加动画：点赞加1
     * @param view
     */
    public void addPlus(View view) {


        //动态的代码

        TranslateAnimation translateAnimation = new TranslateAnimation(0,0,0,1000);
        RotateAnimation rotateAnimation = new RotateAnimation(0,720);
        AnimationSet animationSet = new AnimationSet(true);


        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.setDuration(1000);

        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                addOne_TV.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                addOne_TV.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        addOne_TV.startAnimation(animationSet);


    }

    /**
     * 代码添加xml动画：点赞加1
     * @param view
     */
    public void addPlusXML(View view) {



        Animation animation = AnimationUtils.loadAnimation(this, R.anim.resources);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                addOne_TV.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                addOne_TV.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        addOne_TV.startAnimation(animation);


    }

}
