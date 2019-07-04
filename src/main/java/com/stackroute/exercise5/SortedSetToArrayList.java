package com.stackroute.exercise5;

import java.util.*;
//Program to sort a set and convert it to a list
public class SortedSetToArrayList {
    public ArrayList<String> convertSortedSetToArrayList(Set<String> demoSet)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(demoSet);
        ArrayList<String> demoList = new ArrayList<>(treeSet);

        return demoList;

    }
}
