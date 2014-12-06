package com.evolve_media.source.howlproper.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.Menu;

import com.evolve_media.source.howlproper.app.AppMenu.FlyOutContainer;

/**
 * Created by Dylan on 22/10/2014.
 */
public class MenuActivity extends Activity {

    FlyOutContainer root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.layout_menu, null);
        this.setContentView(root);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menulook ,menu);
        return true;
    }

    public void toggleMenu(View v){
        this.root.toggleMenu();
    }
}
