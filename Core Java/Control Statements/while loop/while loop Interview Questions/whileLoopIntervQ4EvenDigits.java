/*
 * Write a program to display only the even digits from a given number
 */


 import java.util.Scanner;                          // Import Scanner class
 public class whileLoopIntervQ4EvenDigits
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);      // Create a Scanner object           
         System.out.print("Enter a number:");
         int num = scn.nextInt();                   // Read user input, i.e., num = 1234
         int rem = 0;                               // Assign remainder/rem = 0 
         while(num>0)                               // while(condition), i.e., num > 0
         {
             rem = num % 10;    
             if(rem % 2 == 0)                       // if remainder is even
             {
                System.out.println(rem);            // print the even digit
            }         
             num = num / 10;
         }
     }
 }



 /*
    output:
    Enter a number: 1234
    4
    2
  */