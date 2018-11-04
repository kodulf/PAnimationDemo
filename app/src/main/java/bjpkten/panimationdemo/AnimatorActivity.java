package bjpkten.panimationdemo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);

    }


    public void animator(View view) {
        ImageView imageView= (ImageView) findViewById(R.id.composer_camera);
        Animator animator = AnimatorInflater.loadAnimator(this,R.animator.animator_ani);
        animator.setTarget(imageView);
        animator.start();
    }
}
