package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

public class SortedSetToArrayListTest {
    SortedSetToArrayList sortedSetToArrayList;
    @Before
    public void setUp() throws Exception {
        sortedSetToArrayList = new SortedSetToArrayList();
    }

    @After
    public void tearDown() throws Exception {
        sortedSetToArrayList = null;
    }

    @Test
    public void givenInputSetReturnSortedArrayList()
    {
        List<String> actualList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        actualList = sortedSetToArrayList.convertSortedSetToArrayList(set);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Alice");
        expectedList.add("Bluto");
        expectedList.add("Eugene");
        expectedList.add("Harry");
        expectedList.add("Olive");
        assertEquals(expectedList,actualList);
    }
    @Test
    public void givenInputNullReturnNull()
    {
        List<String> actualList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        actualList = sortedSetToArrayList.convertSortedSetToArrayList(set);
        List<String> expectedList = new ArrayList<>();
        assertEquals(expectedList,actualList);
    }
    @Test
    public void givenInputNumberSetReturnSortedArrayList()
    {
        List<String> actualList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.add("1234");
        set.add("897");
        set.add("456");
        set.add("4560");
        set.add("342");
        actualList = sortedSetToArrayList.convertSortedSetToArrayList(set);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("1234");
        expectedList.add("342");
        expectedList.add("456");
        expectedList.add("4560");
        expectedList.add("897");
        assertEquals(expectedList,actualList);
    }
}