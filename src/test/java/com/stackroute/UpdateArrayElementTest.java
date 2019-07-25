package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {

    UpdateArrayElement updateArrayElement;

    //Created object before running the test cases
    @Before
    public void setUp() {
        this.updateArrayElement = new UpdateArrayElement();
    }

    //Destroyed object after running the test cases
    @After
    public void tearDown() {
        this.updateArrayElement = null;
    }

    @Test
    public void givenElemetsInArrayListShouldReturnUpdatedElements() {
        ArrayList inputArrayList = new ArrayList(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        ArrayList outputArrayList = new ArrayList(Arrays.asList("Kiwi", "Grape", "Mango", "Berry"));
        ArrayList actualResult = updateArrayElement.elementUpdater(inputArrayList);
        assertEquals(outputArrayList, actualResult);
    }
}