package com.evolve_media.source.howlproper.app;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

import com.evolve_media.source.howlproper.app.AppMenu.FlyOutContainer;
import com.evolve_media.source.howlproper.app.AppMenu.MenuEventHandlers;

/**
 * Created by Dylan on 11/09/2014.
 */
public class CreateEventActivty extends MenuEventHandlers implements View.OnClickListener {

    TextView textInput;
    Button toggleButton;
    FlyOutContainer root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.fragment_createpage, null);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(root);
        //setContentView(R.layout.fragment_createpage);

        setTextUnderline();

        toggleButton = (Button) findViewById(R.id.toggleButton);

        setAttendEventListener();
        setCreateEventListener();
        setHelpListener();
        setProfileListener();
        setReportListener();
    }

    private void setTextUnderline(){
        textInput = (TextView) findViewById(R.id.doYouFancyTextBox);
        String udata = "Underlined Text";
        SpannableString content = new SpannableString(udata);
        content.setSpan(new UnderlineSpan(), 0, udata.length(), 0);
        textInput.setText(content);
        textInput.setOnClickListener(this);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        textInput.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menulook, (android.view.Menu) menu);
        return true;
    }

    public void toggleMenu(View v){
        this.root.toggleMenu();
        AlterToggleButtonView();
    }

    public void AlterToggleButtonView(){

        int visibility = toggleButton.getVisibility();

        switch (visibility){
            case 8:
                toggleButton.setVisibility(View.VISIBLE);
                break;
            case 0:
                toggleButton.setVisibility(View.GONE);
                break;
        }
    }

}
