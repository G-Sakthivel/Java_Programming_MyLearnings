/*
Write a program to read attendance from the student and perform the below operations,
---> If the student's attendance is greater than 90 then read marks and do the following,
---> If the marks is greater than or equal 80 then increase the marks by 5 else increase the marks by 10
---> Else display "no grace marks!"
 */


import java.util.Scanner;                       // Import Scanner Class
public class nestedIfElseInterviewQ2 {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter your attendance in percentage: ");
        double attendance = scn.nextDouble();   // Read user input, i.e., attendance = 98.2
        if(attendance>90)                       // Outer If condition true
        {                                       // Outer If Block Executed
            System.out.print("Enter your marks out of 100:  ");
            int marks = scn.nextInt();          // Read user input, i.e., marks = 70
            System.out.println("Old Marks: "+marks);    // Old Marks: 70
            if(marks>=80)                       // Inner If condition false
            {
                marks = marks + 5;              // Inner If Block not executed
            }
            else                                // Inner else block executed
            {
                marks = marks + 10;             // marks = 70 + 10 --> 80
            }
            System.out.println("New Marks: "+marks);    // New Marks: 80
        }
        else                                    // Doesn't enter into outer else block
        {
            System.out.println("no grace marks");   // Outer else block not executed
        }
    }
}
