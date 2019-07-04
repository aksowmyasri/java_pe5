package com.stackroute.exercise5;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Program to count number times the strings are repeated in the input and  return as key value pairs i.e map
public class NumberOfCountsInString {
    public Map<String,Integer> checkNumberOfCountsInGivenString(String input)
    {
        Map<String,Integer> maplist= new TreeMap<>();
        Pattern pattern = Pattern.compile("one|two|three");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
        {
            String word = matcher.group();
            if(!maplist.containsKey(word))
                maplist.put(word,1);
            else
                maplist.put(word,maplist.get(word)+1);
        }


        return maplist;
    }
}
