package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountCharacterTest {

    CountCharacter countCharacter;
    //Created object before running the test cases
    @Before
    public void setUp() {
        this.countCharacter = new CountCharacter();
    }

    //Destroyed object after running the test cases
    @After
    public void tearDown() {
        this.countCharacter = null;
    }

    @Test
    public void givenArrayOfStringsShouldReturnTrueMoreThanTwo() {
        String[] inputString = {"a", "a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedResult = new HashMap<>();
        expectedResult.put("a",true);
        expectedResult.put("b",false);
        expectedResult.put("c",true);
        expectedResult.put("d",false);
        Map<String, Boolean> actualResult = countCharacter.characterCounter(inputString);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenInputNullShouldReturnNull() {
        String[] inputString = null;
        Map<String, Boolean> actualResult = countCharacter.characterCounter(inputString);
        assertEquals(null,actualResult);
    }
}