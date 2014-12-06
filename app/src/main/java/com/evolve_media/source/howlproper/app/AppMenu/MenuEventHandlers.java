package com.evolve_media.source.howlproper.app.AppMenu;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.evolve_media.source.howlproper.app.Menu;
import com.evolve_media.source.howlproper.app.R;

/**
 * Created by Dylan on 25/10/2014.
 */
public abstract class MenuEventHandlers extends Activity {

    Button createevent, attendevent, profile, help, report;

    public void setCreateEventListener(){

        createevent = (Button) findViewById(R.id.CreateEventMenuButton);

        createevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.evolve_media.source.howl.main", "com.evolve_media.source.howl.main.CreateEventActivty");
                startActivity(intent);
            }
        });
    }

    public void setAttendEventListener(){

        attendevent = (Button) findViewById(R.id.AttendEventMenuButton);

        attendevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.evolve_media.source.howl.main", "com.evolve_media.source.howl.main.AttendEventActivity");
                startActivity(intent);
            }
        });
    }

    public void setProfileListener(){

        profile = (Button) findViewById(R.id.ProfileMenuButton);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.evolve_media.source.howl.main", "com.evolve_media.source.howl.main.ProfileActivity");
                startActivity(intent);
            }
        });
    }

    public void setHelpListener(){

        help = (Button) findViewById(R.id.HelpMenuButton);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.evolve_media.source.howl.main", "com.evolve_media.source.howl.main.LandingPage");
                startActivity(intent);
            }
        });
    }

    public void setReportListener(){

        report = (Button) findViewById(R.id.ReportMenuButton);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.evolve_media.source.howl.main", "com.evolve_media.source.howl.main.LandingPage");
                startActivity(intent);
            }
        });
    }

    public abstract boolean onCreateOptionsMenu(Menu menu);
}
