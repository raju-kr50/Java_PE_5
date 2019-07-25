package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfStrings {
    public Map stringCounter(String inputString) {
        if (inputString == null) {
            return null;
        }
        Map<String, Integer> count = new HashMap<>();
        String[] arrayString = inputString.split("[\\W_]+");
        for (String findString : arrayString) {
            if (count.containsKey(findString)) {
                count.replace(findString, count.get(findString) + 1);
            } else {
                count.put(findString, 1);
            }
        }
        return count;
    }
}