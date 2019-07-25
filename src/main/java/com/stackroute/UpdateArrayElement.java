package com.stackroute;

import java.util.ArrayList;

public class UpdateArrayElement {
    public ArrayList elementUpdater(ArrayList inputArrayList) {
        inputArrayList.set(0,"Kiwi");
        inputArrayList.set(2,"Mango");
        System.out.println(inputArrayList);
        return inputArrayList;
    }
}
