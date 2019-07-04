package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class RepeatingKeysTest {
    RepeatingKeys repeatingKeys;
    @Before
    public void setUp() throws Exception {
        repeatingKeys = new RepeatingKeys();
    }

    @After
    public void tearDown() throws Exception {
        repeatingKeys = null;
    }

    @Test
    public void givenInputAsArrayOfStringsReturnBooleanValueIfRepeatingMoreThanTwoTimes()
    {
        Map<String,Boolean> actualMap;
        actualMap = repeatingKeys.checkIfStringsRepeatsMoreThanTwoTimes(new String[] {"a","b","c","d","a","c","c"});
        Map<String,Boolean> expectedMap = new TreeMap<>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        assertEquals(expectedMap,actualMap);

    }
    @Test
    public void givenInputAsArrayOfNonRepeatingStringsReturnBooleanValueIfRepeatingMoreThanTwoTimes()
    {
        Map<String,Boolean> actualMap;
        actualMap = repeatingKeys.checkIfStringsRepeatsMoreThanTwoTimes(new String[] {"a","b","c","d"});
        Map<String,Boolean> expectedMap = new TreeMap<>();
        expectedMap.put("a",false);
        expectedMap.put("b",false);
        expectedMap.put("c",false);
        expectedMap.put("d",false);
        assertEquals(expectedMap,actualMap);

    }
    @Test
    public void givenInputAsNullReturnNull()
    {
        Map<String,Boolean> actualMap;
        actualMap = repeatingKeys.checkIfStringsRepeatsMoreThanTwoTimes(new String[] {});
        Map<String,Boolean> expectedMap = new TreeMap<>();

        assertEquals(expectedMap,actualMap);

    }

}