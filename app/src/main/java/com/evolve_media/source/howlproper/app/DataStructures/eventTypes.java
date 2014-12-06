package com.evolve_media.source.howlproper.app.DataStructures;

import java.util.List;

/**
 * Created by Dylan on 19/10/2014.
 */
public class eventTypes extends genericDataManipulator {

    static List<String> eventTypesList;

    private eventTypes(){
        // Constructor that sets the types of events

        eventTypesList.add("Pub");
        eventTypesList.add("Night Out");
        eventTypesList.add("Football Match");
        eventTypesList.add("Cinema");
        eventTypesList.add("Run");
        eventTypesList.add("Walk");

    }

    public void addEventType(String event){
        eventTypesList.add(event);
    }

    public List<String> returnAllEvents(){
        return eventTypesList;
    }

    public List<String> returnAlphabeticalEvents(){
        List<String> copiedList = eventTypesList;
        sortListAlphabetically(copiedList);
        return copiedList;
    }

    public List<String> returnMatchingEvents(String searchString){
        List<String> matchedEvents = searchListForString(searchString, eventTypesList);
        return matchedEvents;
    }

    public List<String> returnMatchingEventsAlphabetical(String searchString){
        List<String> matchedEvents = returnMatchingEvents(searchString);
        matchedEvents = sortListAlphabetically(matchedEvents);
        return matchedEvents;
    }

}
