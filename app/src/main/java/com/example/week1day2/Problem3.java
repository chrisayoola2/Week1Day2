package com.example.week1day2;

public class Problem3 {


    public static void main(String[] args) {
        function(6);// calls function method
        function(45);
        function(2);
        function(10);
    }

    public static void function(int number) { //
        String print;

        if (number % 15 == 0) {
            System.out.println("fizzbuzz"); // conditional to see if number is divisible by both multiples
        }

        else if (number % 5 == 0) {  // conditional to see if number is divisible by 5
            System.out.println("buzz");
        }

        else if (number % 3 == 0) { // conditional to see if number is divisible by 3
            System.out.println("fizz");

        }
        else System.out.println("not divisible");
    }
}


