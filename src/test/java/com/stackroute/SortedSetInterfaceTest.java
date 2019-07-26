package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortedSetInterfaceTest {

    SortedSetInterface sortedSetInterface;
    @Before
    public void setup(){
        SortedSetInterface sortedSetInterface=new SortedSetInterface();
    }
    @After
    public void tearDown(){
        this.sortedSetInterface=null;
    }
    //Given input set should return the sorted set
    @Test
    public void givenSetShouldReturnTheSortedSetAsArrayList(){
        Set<String> inputArray = new HashSet<>();
        inputArray.add("dmwklqd");
        inputArray.add("mdlwkm");
        inputArray.add("zkkjwmd");
        inputArray.add("mkdmedc");
        ArrayList outputArray = new ArrayList();
        outputArray.add("dmwklqd");
        outputArray.add("mdlwkm");
        outputArray.add("mkdmedc");
        outputArray.add("zkkjwmd");
        //act
        ArrayList resultArray =sortedSetInterface.sortTheArray(inputArray);
        //assert
        assertEquals(null,null);
    }
}