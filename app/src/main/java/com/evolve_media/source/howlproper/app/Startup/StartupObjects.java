package com.evolve_media.source.howlproper.app.Startup;

import com.evolve_media.source.howlproper.app.DataStructures.FileReader;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * Created by Dylan on 19/10/2014.
 *
 * This class is aiming to do all of the main pre-loading business that must happen before the main application runs
 */
public class StartupObjects extends FileReader {

    List<Objects> eventList;

    public void start() throws IOException, SAXException {
        loadEventsXML();
    }

    public List<Objects> returnEvents(){
        return eventList;
    }

    public void loadEventsXML() throws IOException, SAXException {
        XMLReader events = ReadXML("events.xml");
        // In here needs to read the xml object, and for each event, create an event object. The add each event object to the eventList List.
    }

}
