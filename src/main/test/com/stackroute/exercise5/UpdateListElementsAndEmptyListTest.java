package com.stackroute.exercise5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateListElementsAndEmptyListTest {
    UpdateListElementsAndEmptyList updateListElementsAndEmptyList;
    List<String> expected;
    List<String> actual;
    @org.junit.Before
    public void setUp() throws Exception {
        updateListElementsAndEmptyList = new UpdateListElementsAndEmptyList();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        updateListElementsAndEmptyList = null;
    }
    @Test
    public void givenInputListReturnReplacedList()
    {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("melon");
        list.add("berry");
        actual = updateListElementsAndEmptyList.replaceElementsInList(list,new int[]{0,2},new String[]{"kiwi","mango"});
        List<String> expectedlist = new ArrayList<>();
        expectedlist.add("kiwi");
        expectedlist.add("grape");
        expectedlist.add("mango");
        expectedlist.add("berry");
        expected=expectedlist;
               assertEquals(expected,actual);

    }
    @Test
    public void givenInputListReturnEmptyList()
    {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("melon");
        list.add("berry");
        actual = updateListElementsAndEmptyList.emptyList(list);
        List<String> expectedlist = new ArrayList<>();
        expected=expectedlist;
        assertEquals(actual,expected);

    }
    @Test
    public void givenInputNullListReturnEmptyList()
    {
        List<String> list = new ArrayList<>();
        actual = updateListElementsAndEmptyList.emptyList(list);
        List<String> expectedlist = new ArrayList<>();
        expected=expectedlist;
        assertEquals(actual,expected);

    }
}