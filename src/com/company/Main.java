//Set up an array to hold the following values, and in this order: 23, 6, 47, 35, 2, 14.
//Write a program to get the average of all 6 numbers. (You can use integers for this exercise, which will round down your answer.)

package com.company;

public class Main {

    public static void main(String[] args) {

        int [] MyAverage = {23, 6, 47, 35, 2, 14};
        int a = MyAverage[0] + MyAverage[1]+ MyAverage[2] + MyAverage[3] + MyAverage[4] + MyAverage[5];
        System.out.println("The sum of arrays is " + a);
        int average = a / MyAverage.length;
        System.out.println("The average of all array numbers is " + average);




    }
}
