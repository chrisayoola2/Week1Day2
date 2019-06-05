package com.example.week1day2;

import java.util.*;


public class Problem4 {


    public static void main(String[] args) {
        System.out.println(checkAnagram("COAT", "TACO"));
        System.out.println(checkAnagram("COAT", "TABO"));


    }

    public static boolean checkAnagram(String word1, String word2) {
        boolean b = false;
        char[] arrayWord1 = word1.toCharArray(); // change string1 into char array
        char[] arrayWord2 = word2.toCharArray(); // change string2 into char array

        if (arrayWord1.length != arrayWord2.length) { // compares if both strings are not the same length return false if not true
            return b;
        }

        Arrays.sort(arrayWord1); // sorts array alphabetically
        Arrays.sort(arrayWord2); // sorts second array alphabetically

        if (Arrays.equals(arrayWord1, arrayWord2)) {  // compares new sorted arrays.
            b = true;

        }
        return b;


    }
}

