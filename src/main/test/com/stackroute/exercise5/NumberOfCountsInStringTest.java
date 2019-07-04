package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;
public class NumberOfCountsInStringTest {
    NumberOfCountsInString numberOfCountsInString;
    @Before
    public void setUp() throws Exception {
        numberOfCountsInString = new NumberOfCountsInString();
    }

    @After
    public void tearDown() throws Exception {
        numberOfCountsInString = null;
    }
    @Test
    public void givenInputStringReturnNoOfCountsInTheString() {
        Map<String, Integer> expectedMap;
      expectedMap = numberOfCountsInString.checkNumberOfCountsInGivenString("one one -one__two,,three,one @three*one?two");
      Map<String,Integer> actualMap = new TreeMap<>();
      actualMap.put("one",5);
      actualMap.put("two",2);
      actualMap.put("three",2);
      assertEquals(actualMap,expectedMap);
    }
    @Test
    public void givenInputStringReturnNoOfCountsInTheStringAsNull() {
        Map<String, Integer> expectedMap;
        expectedMap = numberOfCountsInString.checkNumberOfCountsInGivenString("four five - six there??");
        Map<String,Integer> actualMap = new TreeMap<>();;
        assertEquals(actualMap,expectedMap);
    }
    @Test
    public void givenInputStringAsOneReturnNoOfCountsInTheStringAsOne() {
        Map<String, Integer> expectedMap;
        expectedMap = numberOfCountsInString.checkNumberOfCountsInGivenString("one");
        Map<String,Integer> actualMap = new TreeMap<>();
        actualMap.put("one",1);
        assertEquals(actualMap,expectedMap);
    }


}