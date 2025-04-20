/*
 * Write a program to display fibonacci series for the given length
 */

 /*
    concept:
    Fibonacci Series:
    The Fibonacci series is a series where the next term is the sum of the previous two terms. 
    The first two terms of the Fibonacci sequence are 0 followed by 1.
    Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
  */

import java.util.Scanner;                           // Import Scanner Class
public class forLoopIntervQ6FibonacciSeries 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);       // Create a Scanner object
        System.out.print("Enter any length: ");   
        int length = scn.nextInt();                 // Read user input, i.e., lenght = 7
        int firstTerm = 0;                          // firstTerm = 0 by default
        int secondTerm = 1;                         // secondTerm = 1 by default
        int nextTerm = firstTerm + secondTerm;      // the next term is the sum of the previous two terms
        System.out.print("Fibonacci series upto "+length+" terms is ");
        for(int i=1; i<=length; i++)                // for(initialization; condition; increment/decrement)
        {           
            System.out.print(firstTerm + " ");      // Printing the terms, i.e., 0 1 1 2 3 5 8
            firstTerm = secondTerm;                 // Assigning secondTerm to firstTerm
            secondTerm = nextTerm;                  // Assigning nextTerm to secondTerm
            nextTerm = firstTerm + secondTerm;      // the next term is the sum of the previous two terms
        }
    }  
}



/*
    output:
    Enter any length: 7
    Fibonacci series upto 7 terms is 0 1 1 2 3 5 8
 */

