/*
 * Write a program to check whether the given number is perfect number or not
 */

 /*
    concept:
    Perfect Number: The Given Number == Sum of its factors except the number itself
  */


 import java.util.Scanner;                           // Import Scanner Class
 public class forLoopIntervQ5PerfectNumber
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);       // Create a Scanner Object
         System.out.print("Enter a number: ");
         int num = scn.nextInt();                    // Read user input, i.e, num = 6
         int sum = 0;                                // Initialize sum variable to 0
         for(int i =1; i<=num-1; i++)                // for(initialization; condition; increment/decrement)
         {
             if(num%i==0)                            // If condition only allows i which returns 0 as remainder after num / i (i.e., num%i == 0)
             {
                 sum = sum + i;                      // sum = 1 + 2 + 3  --> 6
             }
         }
         System.out.println("Given number = "+num);  // num = 6     
         System.out.println("Sum of factors of "+num+" = "+sum); // sum = 6
         if(num == sum)                                          // If condition true, i.e., 6 == 6
         {                                                       // If block executed
            System.out.println(num+" is a perfect number");      // 6 is a perfect number
         }
         else                                                    // Doesn't enter into else block
         {
            System.out.println(num+" is not a perfect number");  // else block not executed
         }
 
     }
     
 }


 /*
    output:
    Enter a number: 6
    Given number = 6
    Sum of factors of 6 = 6
    6 is a perfect number
  */
