/*
Write a program to print the count of all odd numbers from 1 to n
 */


import java.util.Scanner;                       // Import Scanner Class
public class forLoopExample12
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter n: ");
        int n  = scn.nextInt();                 // Read user input, i.e., n = 10
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)                          // If condition only allows odd numbers inside it
            {
                count++;                        // Count(1,3,5,7,9) = 5
            }
        }
        System.out.println("Count of all odd numbers from 1 to "+n+": "+ count);
    }
}


/*
output:
Enter n: 10
count of all odd numbers from 1 to 10: 5
 */
