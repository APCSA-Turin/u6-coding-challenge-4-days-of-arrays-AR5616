package com.example.project;
import java.util.Random;

public class Day2 {
    public static String[][] nameSort(String[] names) { // your will be tested on this method
        String [][] niceOrNaughty = new String[2][names.length];
        Random num = new Random();
        for (int i = 0; i < names.length; i++) {
            int sortList = num.nextInt(2);
            niceOrNaughty[sortList][i] = names[i];
        }
        return niceOrNaughty; //you must return a two dimensional string array
    }
}