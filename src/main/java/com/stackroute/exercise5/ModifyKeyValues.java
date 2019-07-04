package com.stackroute.exercise5;

import java.util.Iterator;
import java.util.Map;
//Program to replace 1st key to empty value and 2nd value to 1st value
public class ModifyKeyValues {
    public Map<String, String> modifyKeyValuesOfMap(Map<String, String> mapList) {
        Iterator iterator = mapList.entrySet().iterator();
        if (iterator.hasNext()) {
        Map.Entry entry = (Map.Entry) iterator.next();
        String word = " ";

            if (!mapList.get("val1").equals(" ")) {
                word = (String) entry.getValue();
                mapList.put("val1", " ");
            }
            Map.Entry presentEntry = (Map.Entry) iterator.next();
            if (word != null)
                presentEntry.setValue(word);

        }
        return mapList;
    }
}
