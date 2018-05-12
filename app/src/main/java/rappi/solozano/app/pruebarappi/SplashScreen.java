package rappi.solozano.app.pruebarappi;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity implements Runnable{

    ImageView img;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        img = findViewById(R.id.img_splash);

        final Animation animation_1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animation_1.reset();
        img.clearAnimation();
        img.startAnimation(animation_1);

        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            int waited = 0;
            while (waited < 3000) {
                sleep(100);
                waited += 100;
            }
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
            SplashScreen.this.finish();
        } catch (InterruptedException e) {

        } finally {
            SplashScreen.this.finish();
        }

    }
}
