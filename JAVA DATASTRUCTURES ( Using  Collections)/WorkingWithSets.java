import java.util.*;

public class WorkingWithSets {
    public static void main (String [] args) {
        //A collection that contains no duplicate elements
        //Set can't be accessed by its index value
        //No particular order for execution of a set
        //sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element.
        //As implied by its name, this interface models the mathematical set abstraction.
        System.out.println("Implementation of Set :");
        //Interface - Set and Collections - HashSet implementation (no particular order)
        //TreeSet and EnumSet Implementation is also available to mainly focus on the order of a set
        Set<Ball> balls = new HashSet<>();
        //To add an element to a set such that no duplicates are allowed to insert in a set
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("White"));
        //Duplicated are not allowed, so this duplicate colors:Blue can be untouched and not be taken in a set
        balls.add(new Ball("Blue"));


        System.out.println("*");
        //To display the elements of a set
        System.out.println(balls);
        //Loop (Iterates) or Traverse through a set using forEach loop
        balls.forEach(System.out::println);
        //To get the size of a set
        System.out.println(balls.size());
        //remove(obj) method is used to remove elements by returning true if this set contained the specified element
        System.out.println(balls.remove(new Ball("Red")));
        //isEmpty()-Returns true if this set contains no elements.
        System.out.println(balls.isEmpty());
        System.out.println();

        System.out.println("**");
        System.out.println(balls);
        balls.forEach(System.out :: println);
        System.out.println(balls.size());
        System.out.println(balls.remove(new Ball("White")));
        System.out.println(balls.isEmpty());
        System.out.println();

        System.out.println("***");
        System.out.println(balls);
        balls.forEach(System.out :: println);
        System.out.println(balls.size());
        //The element white ball is already removed therefore it returns false because the obtained set does not contain a specified element or object
        System.out.println(balls.remove(new Ball("White")));
        System.out.println(balls.isEmpty());
        System.out.println();

        System.out.println("****");
        System.out.println(balls);
        balls.forEach(System.out :: println);
        System.out.println(balls.size());
        System.out.println(balls.remove(new Ball("Blue")));
        System.out.println(balls.isEmpty());
        System.out.println();

        System.out.println("*****");
        System.out.println(balls);
        balls.forEach(System.out :: println);
        System.out.println(balls.size());
        System.out.println(balls.remove(new Ball("Blue")));
        System.out.println(balls.isEmpty());
        System.out.println();

    }
    //A record class is a shallowly immutable, transparent carrier for a fixed set of values, called the record components. The Java language provides concise syntax for declaring record classes, whereby the record components are declared in the record header. The list of record components declared in the record header form the record descriptor.
    static record Ball (String colors) {

    }
}
