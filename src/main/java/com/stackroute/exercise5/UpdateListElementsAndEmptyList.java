package com.stackroute.exercise5;

import java.util.List;
//Program to replace elements in the list at specific indices
public class UpdateListElementsAndEmptyList {
    public List<String> replaceElementsInList(List<String> list,int[] index,String[] replace)
    {
        for(int i=0;i<index.length;i++) {

            list.set(index[i], replace[i]);

        }
        return list;
    }
    public List<String> emptyList(List<String> list)
    {

        list.clear();
        return list;
    }
}
