//package com.stackroute;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class SortedSetInterfaceTest {
//
//    SortedSetInterface sortedSetInterface;
//    @Before
//    public void setup(){
//        setInterface=new SetInterface();
//    }
//    @After
//    public void tearDown(){
//        setInterface=null;
//    }
//    //Given input set should return the sorted set
//    @Test
//    public void givenSetShouldReturnTheSortedSetAsArrayList(){
//        Set<String> inputArray = new HashSet<>();
//        inputArray.add("caesar");
//        inputArray.add("brudo");
//        inputArray.add("dracarys");
//        inputArray.add("drogon");
//        ArrayList outputArray = new ArrayList();
//        outputArray.add("brudo");
//        outputArray.add("caesar");
//        outputArray.add("dracarys");
//        outputArray.add("drogon");
//        //act
//        ArrayList resultArray =setInterface.sortTheArray(inputArray);
//        //assert
//        assertEquals(outputArray,resultArray);
//    }
//}