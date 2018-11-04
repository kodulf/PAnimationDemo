package bjpkten.panimationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AnimationListAcitivyt extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_list_acitivyt);

        imageView = (ImageView)findViewById(R.id.image);
    }

    /**
     * 启停操作
     * https://blog.csdn.net/Rodulf/article/details/50830813
     * @param view
     */
    public void startStop(View view) {
        AnimationDrawable drawable = (AnimationDrawable) imageView.getDrawable();
        if(drawable.isRunning()){
            drawable.stop();
        }else{
            drawable.start();
        }

    }
}
