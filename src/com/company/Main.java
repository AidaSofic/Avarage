//Set up an array to hold the following values, and in this order: 23, 6, 47, 35, 2, 14.
//Write a program to get the average of all 6 numbers. (You can use integers for this exercise, which will round down your answer.)

package com.company;

public class Main {

    public static void main(String[] args) {

        int [] MyAverage = new int []{23, 6, 47, 35, 2, 14};
        double sum = 0;
        double average;

        for (int i = 0; i<MyAverage.length; i++) {
            sum = sum + MyAverage[i]; // sum += MyAverage[i]

        }
        System.out.println("The sum of the numbers in array is: " +sum);

        average = sum / MyAverage.length;
        System.out.println("The average of all array numbers is " + average);




    }
}
