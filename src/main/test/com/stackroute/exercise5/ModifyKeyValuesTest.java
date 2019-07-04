package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ModifyKeyValuesTest {
    ModifyKeyValues modifyKeyValues;
    @Before
    public void setUp() throws Exception {
        modifyKeyValues = new ModifyKeyValues();
    }

    @After
    public void tearDown() throws Exception {
        modifyKeyValues = null;
    }
    @Test
    public void givenInputMapReturnModifiedMap()
    {
        Map<String,String> actualMap = new TreeMap<>();
        Map<String,String> putMap = new TreeMap<>();
        putMap.put("val1","java");
        putMap.put("val2","c++");
        actualMap = modifyKeyValues.modifyKeyValuesOfMap(putMap);
        Map<String,String> expectedMap = new TreeMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","java");
        assertEquals(expectedMap,actualMap);
    }
    @Test
    public void givenInputNullReturnNullMap()
    {
        Map<String,String> actualMap = new TreeMap<>();
        Map<String,String> putMap = new TreeMap<>();
        actualMap = modifyKeyValues.modifyKeyValuesOfMap(putMap);
        Map<String,String> expectedMap = new TreeMap<>();
        assertEquals(expectedMap,actualMap);
    }
    @Test
    public void givenInputMapReturnBothValuesAsEmptyMap()
    {
        Map<String,String> actualMap = new TreeMap<>();
        Map<String,String> putMap = new TreeMap<>();
        putMap.put("val1"," ");
        putMap.put("val2","c++");
        actualMap = modifyKeyValues.modifyKeyValuesOfMap(putMap);
        Map<String,String> expectedMap = new TreeMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2"," ");
        assertEquals(expectedMap,actualMap);
    }
}