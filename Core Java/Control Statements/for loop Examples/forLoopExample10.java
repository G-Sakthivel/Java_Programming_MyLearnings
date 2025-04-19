/*
Write a program to print the sum of all odd numbers from 1 to n
 */


import java.util.Scanner;                       // Import Scanner Class
public class forLoopExample10
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter n: ");
        int n  = scn.nextInt();                 // Read user input, i.e., n = 5
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)                          // If condition only allows odd numbers inside it
            {
                sum = sum + i;                  // sum = 1 + 3 + 5 --> 9
            }
        }
        System.out.println("Sum of all odd numbers: "+ sum);
    }
}


/*
output:
Enter n: 5
Sum of all odd numbers: 9
 */
