package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountNumberOfStringsTest {

    CountNumberOfStrings countNumberOfStrings;
    //Created object before running the test cases
    @Before
    public void setUp() {
        this.countNumberOfStrings = new CountNumberOfStrings();
    }

    //Destroyed object after running the test cases
    @After
    public void tearDown() {
        this.countNumberOfStrings = null;
    }

    @Test
    public void givenInputStringShouldReturnNumberOfStrings() {
        String inputString = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("one",5);
        expectedResult.put("two",2);
        expectedResult.put("three",2);
        Map<String,Integer> actualResult = countNumberOfStrings.stringCounter(inputString);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenNullValueShouldReturnNull() {
        String inputString = null;
        Map<String, Integer> expectedResult = null;
        Map<String,Integer> actualResult = countNumberOfStrings.stringCounter(inputString);
        assertEquals(expectedResult, actualResult);
    }
}