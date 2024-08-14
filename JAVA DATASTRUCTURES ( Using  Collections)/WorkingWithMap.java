import java.util.*;
public class WorkingWithMap {
    public static void main (String [] args) {
        System.out.println("Map :");
        //An object that maps keys to values
        //A map cannot contain duplicate keys
        //each key can map to at most one value
        //This interface takes the place of the Dictionary class
        //Interface - Map and Implementation - HashMap()
        Map<Integer,person> map = new HashMap<>();
        //To map keys to value
        map.put(1,new person("Mahi"));
        map.put(2,new person("Shakthi"));
        map.put(3,new person("Dhoni"));
        map.put(4,new person("Mahi"));
        //No duplicate keys are allowed
        map.put(4,new person("Mahi"));
        //The latest value of the same key should override the oldest value
        map.put(4,new person("MSD"));


        //To display keys and values in a map
        System.out.println(map);
        System.out.println();

        //To get the size of a map
        System.out.println(map.size());
        System.out.println();

        //isEmpty() - returns true if the map is empty
        System.out.println(map.isEmpty());
        System.out.println();

        //entrySet() - Returns a Set view of the mappings contained in this map
        System.out.println(map.entrySet());
        System.out.println();

        //To remove values specified to a key
        System.out.println(map.remove(3));
        System.out.println();

        //Loop through a map
        map.entrySet().forEach(System.out :: println);
        System.out.println();

        //for each loop using lambda
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println();

        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });
        System.out.println();

        //To get a values of the specified key
        System.out.println(map.get(3));
        System.out.println();

        //getOrDefault() - Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key
        System.out.println(map.getOrDefault(3,new person("MSDhoni")));
        System.out.println();

        //To get a values of the specified key
        System.out.println(map.get(4));
        System.out.println();

        //keySet() - Returns a Set view of the keys contained in this map
        System.out.println(map.keySet());
        System.out.println();

        //values() - Returns a Collection view of the values contained in this map
        System.out.println(map.values());
        System.out.println();

        //containsKey(key) - Returns true if this map contains a mapping for the specified key
        System.out.println(map.containsKey(5));
        System.out.println();

        //containsValue(obj.value) - Returns true if this map maps one or more keys to the specified value
        System.out.println(map.containsValue(new person("Mahi")));
        System.out.println();

        //replace() - Replaces the entry for the specified key only if it is currently mapped to some value
        System.out.println(map.replace(2,new person("Sachin")));;
        System.out.println();


        System.out.println(map);
    }

    static record person (String names){

    }
}
