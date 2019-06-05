# Week1Day2
1. Create a function to print the duplicates in a list of strings
   public void findDuplicates(List<String> strings){};
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

  
  ![Problem 1](https://user-images.githubusercontent.com/51377425/58972449-97e3bf80-878b-11e9-90a5-db6f32755741.png)

2. Create function to check if the string is a palindrome without using string.reverse() method
   public boolean checkPalindrome(String word){};
   
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

![Problem 2](https://user-images.githubusercontent.com/51377425/58972850-8353f700-878c-11e9-9cc1-516797d5cff4.png)

3. Create a function that will print:
     "fizz" is the number is divisible by 3
     "buzz" is the number is divisible by 5
     "fizzbuzz" is the number is divisible by both
     
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
 ![Problem3](https://user-images.githubusercontent.com/51377425/58972860-8818ab00-878c-11e9-9345-c67900e8c6a0.png)
 
 
 

4.  Create a function to check if the two strings are Anagrams:    Eg COAT and TACO would be anagrams
   public boolean checkAnagrams(String word1, String word2){};
   
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
![Problem 4](https://user-images.githubusercontent.com/51377425/58972455-9d410a00-878b-11e9-8cc8-9dc3e41d6ef0.png)


5. Print a multiplication table from 1 to 10 using  multidimensional array
   Output
   1 2 3 4 5 6 7 8 9 10
   2 4 6 8 10 12 14 16 18 20
    ...
 public void printTables(){};
 
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
![Problem 5](https://user-images.githubusercontent.com/51377425/58972844-7f27d980-878c-11e9-9d38-e56a44beb2ca.png)






