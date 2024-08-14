import java.util.*;
public class HashFunctionsAndHashCode {
    public static void main (String[] args) {
        //An object that maps keys to values
        //A map cannot contain duplicate keys
        //each key can map to at most one value
        System.out.println("HashFunctions and HashCode :");
        System.out.println();
        Map<cricketer,country> map = new HashMap<>();
        map.put(new cricketer("Mahi"),new country("India"));
        map.put(new cricketer("David Warner"),new country("Australia"));
        System.out.println(map);
        System.out.println();


        //hashcode() -Returns a hash code value for the record
        //For Integers - It produces a hashcode as same as its own integer value
        //For values(obj) and Strings - It produces a unique hashcode
        //any two records created from the same components must have the same hash code
        System.out.println(map.get(new cricketer("Mahi")));
        System.out.println(new cricketer("Mahi").hashCode());
        System.out.println(new cricketer("Mahi").hashCode());
        System.out.println(new country("India").hashCode());
        System.out.println(new country("India").hashCode());
        System.out.println();

        System.out.println(map.get(new cricketer("David Warner")));
        System.out.println(new cricketer("David Warner").hashCode());
        System.out.println(new cricketer("David Warner").hashCode());
        System.out.println(new country("Australia").hashCode());
        System.out.println(new country("Australia").hashCode());


    }
    static record cricketer(String names)  {

    }

    public static record country(String names) {

    }
}
