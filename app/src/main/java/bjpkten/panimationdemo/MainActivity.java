package bjpkten.panimationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToAnimationAcitivity(View view) {
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }

    /**
     * 帧动画，可以用来做那种点名
     * @param view
     */
    public void jumpToZhenAnimationAcitivity(View view) {
        Intent intent = new Intent(this, AnimationListAcitivyt.class);
        startActivity(intent);
    }

    /**
     * 属性动画，可以用来做那种抽奖的转盘
     * @param view
     */
    public void jumpToAnimatorAcitivity(View view) {
        Intent intent = new Intent(this, AnimatorActivity.class);
        startActivity(intent);
    }
}
