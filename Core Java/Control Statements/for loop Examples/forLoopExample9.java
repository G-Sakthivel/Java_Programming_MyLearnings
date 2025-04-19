/*
Write a program to print the sum of all even numbers from 1 to n
 */


import java.util.Scanner;                       // Import Scanner Class
public class forLoopExample9
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter n: ");
        int n  = scn.nextInt();                 // Read user input, i.e., n = 5
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)                          // If condition only allows even numbers inside it
            {
                sum = sum + i;                  // sum = 2 + 4 --> 6
            }
        }
        System.out.println("Sum of all even numbers: "+ sum);
    }
}


/*
output:
Enter n: 5
Sum of all even numbers: 6
 */
