package com.example.week1day2;

import java.util.*;


public class Problem2 {
    public static String word = "kayak";

    public static void main(String[] args) {
        System.out.println(checkPalindrome(word)); // calls method
    }

    public static boolean checkPalindrome(String name) {
        boolean b = false;

        if (((name.length()) % 2) == 0) {   // conditional to see if the word is odd or even
            char[] wordChar = name.toCharArray();  //change string to character array
            int midStart = (wordChar.length / 2) + 1; // gets midstart point
            char[] first = new char[midStart]; //  puts first half of string into a new array
            char[] second = new char[midStart]; // puts second half of string into a second array
            int count = 0;
            int counter = 0;

            for (int i = 0; i < midStart; i++) {
                first[count] = wordChar[i];
                count++;
            }
            for (int j = wordChar.length - 1; j >= midStart - 2; j--) {
                second[counter] = wordChar[j];
                counter++;
            }
            b = (Arrays.equals(first, second));

        }


        if (((name.length()) % 2) == 1) { // conditional to see if the word is odd or even
            char[] wordChar = name.toCharArray(); //change string to character array
            int midStart = (wordChar.length / 2) + 1;// gets midstart point
            char[] first = new char[midStart]; //  puts first half of string into a new array
            char[] second = new char[midStart];// puts second half of string into a second array
            int count = 0;
            int counter = 0;

            for (int i = 0; i < midStart; i++) {
                first[count] = wordChar[i];
                count++;
            }
            for (int j = wordChar.length - 1; j >= midStart - 1; j--) {
                second[counter] = wordChar[j];
                counter++;
            }

            b = (Arrays.equals(first, second));


        }
        return b;
    }


}






