package com.example.amauryesparza.tweenanimation;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity implements Animation.AnimationListener{

    private ImageView image;

    private Animation scaleAnimation;
    private Animation translateAnimation;
    private Animation alphaAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imageView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void rotateAnimation(View v){
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        rotateAnimation.setAnimationListener(this);
        image.startAnimation(rotateAnimation);

    }

    public void scaleAnimation(View v){
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        scaleAnimation.setAnimationListener(this);
        image.startAnimation(scaleAnimation);
    }

    public void translateAnimation(View v){
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.tranlate_anim);
        translateAnimation.setAnimationListener(this);
        image.startAnimation(translateAnimation);
    }

    public void alphaAnimation(View v){
        Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        alphaAnimation.setAnimationListener(this);
        image.startAnimation(alphaAnimation);

    }

    //Animation Listeners
    @Override
    public void onAnimationStart(Animation animation){
        Toast.makeText(this, "Animation Start", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(this, "Animation Repeat", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAnimationEnd(Animation animation){
        Toast.makeText(this, "Animation End", Toast.LENGTH_LONG).show();
    }
    //
}
