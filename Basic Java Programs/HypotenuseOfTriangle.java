import java.util.*;
import java.lang.Math;
public class HypotenuseOfTriangle {
    public static void main(String [] args) {
        System.out.println("This program is to find the hypotenuse of a triangle.");
        //Scanner class is used to get input from the user
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter side a :");
        double a = scn.nextDouble(); // To get input of side a from the user
        System.out.println("Enter side b :");
        double b = scn.nextDouble(); //To get input of side b from the user
        //Formulae for Finding the hypotenuse of a triangle is, c= sqrt(a^2 + b^2)
        double c = Math.sqrt((a*a)+(b*b)); // To find the hypotenuse of a triangle

        System.out.println("The Hypotenuse of a Triangle is :" + c);
        scn.close();//used to terminate the scanner class
    }
}
