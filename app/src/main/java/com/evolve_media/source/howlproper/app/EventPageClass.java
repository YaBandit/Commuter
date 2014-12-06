package com.evolve_media.source.howlproper.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.evolve_media.source.howlproper.app.Event.EventObject;

/**
 * Created by Dylan on 19/10/2014.
 */
public class EventPageClass extends Activity {

    EventObject eventObject;

    TextView detailsTextView, locationTextView, eventTextView;
    ImageView eventImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        detailsTextView = (TextView) findViewById(R.id.EventDetails);
        locationTextView = (TextView) findViewById(R.id.EventsLocation);
        eventTextView = (TextView) findViewById(R.id.EventTitle);

        eventImage = (ImageView) findViewById(R.id.EventImage);
    }

    public void SetEventDetails(EventObject eventObject){
        this.eventObject = eventObject;
        eventTextView.setText(eventObject.getEventName());
        locationTextView.setText(eventObject.getlocation());
        detailsTextView.setText(eventObject.getDetails());
    }
}
