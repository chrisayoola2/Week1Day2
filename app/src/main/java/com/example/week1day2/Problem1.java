package com.example.week1day2;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;

import java.lang.reflect.Array;
import java.util.*;


public class Problem1 {

    public ArrayList<String> myString;
    public ArrayList<String> dupString;


    public static void main(String[] args) {
        ArrayList<String> myString = new ArrayList<String>(); // creates arrayList
        // addind test cases
        myString.add("Manny");
        myString.add("Michael");
        myString.add("manny");
        myString.add("Becky");
        myString.add("Tom");
        myString.add("Becky");
        myString.add("samantha");
        myString.add("Becky");
        findDuplicates(myString);
    }

    public static void findDuplicates(List<String> nameMe) {

        ArrayList<String> dupString = new ArrayList<String>(); // creates new fot duplicates

        for (int i = 0; i < nameMe.size(); i++) {

            for (int j = i + 1; j < nameMe.size(); j++) {

                if (nameMe.get(i).equals(nameMe.get(j))) { //looks for duplicates in the original array

                    if (dupString.contains(nameMe.get(i))) // checks if the duplicate is already in the new array list
                        break;
                    else
                        dupString.add(nameMe.get(i)); //adds duplicate if it is not already in the new arraylist
                }
            }
        }
        for (String s : dupString) {
            System.out.println(s); // print out the new arraylist showing duplicate values
        }
    }
}




