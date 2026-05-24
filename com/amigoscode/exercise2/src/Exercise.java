//I'm trying to compare two numbers here
package com.amigoscode;

public class Exercise {
    public static void main(String[] args) {
        // Create variables to store the numbers and the result
        int number1 = 10;
        int number2 = 20;
        String result;

        // Compare the numbers using the comparison operator
        if (number1 > number2) {
            result = number1 + " is greater than " + number2;
        } else if (number1 < number2) {
            result = number1 + " is less than " + number2;
        } else {
            result = number1 + " is equal to " + number2;
        }

        // Print the result
        System.out.println(result);
    }
}
