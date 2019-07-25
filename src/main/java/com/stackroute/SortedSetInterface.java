package com.stackroute;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetInterface {
    public class SetInterface {
        public ArrayList<String> sortTheArray(Set<String> inputArray) {
            TreeSet sortedList=new TreeSet();
            sortedList.addAll(inputArray);
            ArrayList<String> finalList=new ArrayList<>();
            finalList.addAll(sortedList);
            return finalList;
        }
    }
}
