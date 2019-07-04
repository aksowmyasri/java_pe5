package com.stackroute.exercise5;

import java.util.Map;
import java.util.TreeMap;
//Program to find whether the strings are repeating for more than two times
public class RepeatingKeys {
    public Map<String,Boolean> checkIfStringsRepeatsMoreThanTwoTimes(String[] input)
    {
        Map<String,Boolean> resultMap = new TreeMap<>();
        for(int i=0;i<input.length;i++)
        {
            String word = input[i];
            if(!resultMap.containsKey(word))
                resultMap.put(word,false);
            else
                resultMap.put(word,true);
        }
        return resultMap;
    }
}
