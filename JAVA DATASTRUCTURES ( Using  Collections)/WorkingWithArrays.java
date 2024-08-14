import java.util.*;
public class WorkingWithArrays {
    public static void main(String [] args) {
//Array initialization
        String[] colors = new String[5];
        colors[0] = "Blue";
        colors[1] = "Red";
        colors[2] = "white";

        System.out.println(Arrays.toString(colors));
//print the elements in an array separately using index or accessing the elements in an array using indexes.
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

// creation of an array dynamically
        String[] sports = {"Cricket","Football","Volleyball","Tennis"}   ;
        System.out.println(Arrays.toString(sports));

//Accessing of an array elements using traditional for loop

        for (int i=0;i< sports.length;i++) {
            System.out.println(sports[i]);
        }

//print the reversed list of the elements in an array

        for(int i = sports.length-1;i>=0;i--)  {
            System.out.println(sports[i]);
        }

//Accessing of an array elements using enhanced for loop

        for( String sport : sports ){
            System.out.println(sport);

        }

//Accessing of an array elements using for each loop or arrays.stream

        Arrays.stream(sports).forEach(System.out::println);





    }
}
