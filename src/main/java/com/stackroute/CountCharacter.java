package com.stackroute;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountCharacter {
    public Map<String, Boolean> characterCounter(String[] inputString) {
        int[] count = {0, 0, 0, 0};
        if (inputString==null){
            return null;
        }
        System.out.println(inputString.length);
        for (int i = 0; i < inputString.length; i++) {
            if (inputString[i].equals("a")) {
                count[0]++;
            } else if (inputString[i].equals("b")) {
                count[1]++;
            } else if (inputString[i].equals("c")) {
                count[2]++;
            } else if (inputString[i].equals("d")) {
                count[3]++;
            }
        }

        Map<String, Boolean> map = new HashMap<>();

        boolean condtion = false;

        if (count[0] > 1) {
            condtion = true;
            map.put("a", true);
        } else {
            map.put("a", false);
        }

        if (count[1] > 1) {
            condtion = true;
            map.put("b", true);
        } else {
            map.put("b", false);
        }

        if (count[2] > 1) {
            condtion = true;
            map.put("c", true);
        } else {
            map.put("c", false);
        }

        if (count[3] > 1) {
            condtion = true;
            map.put("d", true);
        } else {
            map.put("d", false);
        }

        return map;

    }
}