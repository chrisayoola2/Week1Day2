package com.example.week1day2;

import java.util.Arrays;

public class problem5 {

    public static void main(String[] args) {

        printTables();
    }

    public static void printTables() {

        int[][] twoD_Array = new int[10][10]; // creates 2d array
        for (int i = 0; i < twoD_Array.length; i++) { // for loop for the columns

            for (int j = 0; j < twoD_Array.length; j++) { //for loop for the rows
                twoD_Array[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3d ", twoD_Array[i][j]); // print and align as each spot is filled
            }
            System.out.println(); // gives new line
        }

    }
}

