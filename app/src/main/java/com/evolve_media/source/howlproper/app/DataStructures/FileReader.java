package com.evolve_media.source.howlproper.app.DataStructures;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import java.io.IOException;

/**
 * Created by Dylan on 19/10/2014.
 */
public abstract class FileReader {

    public XMLReader ReadXML(String xmlLocation) throws IOException, SAXException {
        XMLReader events = null;
        events.parse(xmlLocation);
        return events;
    }

}
