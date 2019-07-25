package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyValueTest {

    ModifyKeyValue modifyKeyValue;
    //Created object before running the test cases
    @Before
    public void setUp() {
        this.modifyKeyValue = new ModifyKeyValue();
    }

    //Destroyed object after running the test cases
    @After
    public void tearDown() {
        this.modifyKeyValue = null;
    }

    @Test
    public void givenTwoMapKeyValuesShouldReturnOneValueNullAndOtherOfFirstValue() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("value1", "Java");
        inputMap.put("value2", "C++");
        Map<String, String> outputMap = new HashMap<>();
        outputMap.put("value1", "C++");
        outputMap.put("value2", "");

        Map<String, String> actualResult = modifyKeyValue.keyValueModifier(inputMap);
        assertEquals(outputMap,actualResult);

    }

    @Test
    public void givenNullKeyValueShouldReturnNull(){
        Map<String, String> outputMap =null;
        Map<String, String> actualResult = modifyKeyValue.keyValueModifier(null);
        assertEquals(outputMap,actualResult);
    }
}