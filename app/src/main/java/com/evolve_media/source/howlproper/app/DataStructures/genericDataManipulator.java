package com.evolve_media.source.howlproper.app.DataStructures;

import java.util.Collections;
import java.util.List;

/**
 * Created by Dylan on 19/10/2014.
 */
public abstract class genericDataManipulator {

    public List<String> sortListAlphabetically(List<String> inputList){
        List<String> sortedList = inputList;
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<String> searchListForString(String searchString, List<String> inputList){
        List<String> matchedItems = null;
        for (String item : inputList){
            if (item.contains(searchString)){
                matchedItems.add(item);
            }
        }
        return matchedItems;
    }

}
