package com.evolve_media.source.howlproper.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.ImageView;

/**
 * Created by Dylan on 21/09/2014.
 */
public class ProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // THE BELOW REMOVES THE NOTIFICATIONS BAR
        // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void SetImageHeight(){
        ImageView profilePicture = (ImageView) findViewById(R.id.imageViewProfile);
        profilePicture.setMaxHeight(50);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menulook, menu);
        return true;
    }
}
