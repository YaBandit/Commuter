package com.evolve_media.source.howlproper.app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Dylan on 21/09/2014.
 */
public class Menu extends ListActivity {

    String activites[] = {"Do You Fancy", "I Fancy A", "Profile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, activites));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String placeholder = activites[position];
        try{
            Class ourClass = Class.forName("com.evolve_media.source.howl.main." + placeholder);
            Intent intent = new Intent(Menu.this, ourClass);
            startActivity(intent);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
