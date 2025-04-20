/*
 * Write a program to display factors of a given number
 */


import java.util.Scanner;                           // Import Scanner Class
public class forLoopIntervQ1Factors 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);       // Create a Scanner Object
        System.out.print("Enter a number: ");
        int num = scn.nextInt();                    // Read user input, i.e, num = 6
        System.out.println("Factors of "+num+" = ");
        for(int i =1; i<=num; i++)                  // for(initialization; condition; increment/decrement)
        {
            if(num%i==0)                            // If condition only allows i which returns 0 as remainder after num / i (i.e., num%i == 0)
            {
                System.out.println(i);              // Print the factors of a given number
            }
        }

    }
    
}



/*
    output:
    Enter a number: 6
    Factors of 6 =
    1
    2
    3
    6
 */