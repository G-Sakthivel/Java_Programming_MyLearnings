import java.util.*;
public class SwappingOfTwoValues {
    public static void main (String [] args) {
        System.out.println("Swapping of Two Values :");
        String x = "Mahi"; //Initialization of String x
        String y = "Shakthi"; //Initialization of String y
        //The values before Swapping
        System.out.println("The value of x before swapping :" + x);
        System.out.println("The value of y before swapping :" + y);

        String temp;//Initialization of String temp
        temp = x; //Assigning x value to temp, eg: temp="Mahi"
        x = y; //Assigning y value to x, eg: x="Shakthi"
        y = temp; //Assigning temp value to y, eg: y="Mahi"

        //The values after Swapping
        System.out.println("The value of x after swapping :" + x);
        System.out.println("The value of y after swapping :" + y);

    }
}
