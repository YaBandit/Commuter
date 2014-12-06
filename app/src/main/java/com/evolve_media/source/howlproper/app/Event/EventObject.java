package com.evolve_media.source.howlproper.app.Event;

import java.util.Date;

/**
 * Created by Dylan on 20/09/2014.
 */
public class EventObject {

    String details;
    Date startTime;
    String eventName;
    String location;

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getlocation() {
        return location;
    }
    public void setlocation(String location) { this.location = location; }

}
