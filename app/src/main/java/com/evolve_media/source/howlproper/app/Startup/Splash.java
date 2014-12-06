package com.evolve_media.source.howlproper.app.Startup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.evolve_media.source.howlproper.app.R;

/**
 * Created by Dylan on 16/10/2014.
 */
public class Splash extends Activity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // THE BELOW REMOVES THE NOTIFICATIONS BAR
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.layout_splash);

        Thread timer = new Thread() {
            public void run() {
                try {
                    //StartupObjects startupObjects = new StartupObjects();
                    //startupObjects.start();
                    sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }// catch (SAXException e) {
                   // e.printStackTrace();
                //} catch (IOException e) {
                   // e.printStackTrace();
                //}
                finally {
                    Intent startProgram = new Intent("com.evolve_media.source.howl.main.LandingPage");
                    startActivity(startProgram);
                }
            }
        };
        timer.start();

        System.out.println("We got here");
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
