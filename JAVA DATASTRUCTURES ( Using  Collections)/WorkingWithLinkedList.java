import java.util.*;
public class WorkingWithLinkedList {
    public static void main(String [] args) {
        System.out.println("Implementation of LinkedList :");
        //LinkedList contains head(point towards the first element of a list) and Tail(point towards the last element of a list)
        //LinkedList - (reference to the next) and doubly LinkedList - (reference to next and prev)
        //LinkedLists are commonly expensive in memory space
        //Interface - LinkedList and Collections - LinkedList
        LinkedList<person> linkedList = new LinkedList<>();
        //To add an elements into a LinkedList
        linkedList.add(new person("Mahi", 18));
        //To add an element to the specified position of the LinkedList, eg: index:1
        linkedList.add(1, new person("Shakthi", 20));
        //To add an elements to the last position (to the tail) of the LinkedList
        linkedList.addLast(new person("Dhoni", 40));
        //To add an elements to the first position (to the head) of the LinkedList
        linkedList.addFirst(new person("MSD", 36));

        //we can loop or traverse through the LinkedList using ListIterator
        //An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, and obtain the iterator's current position in the list
        ListIterator<person> PersonListIterator = linkedList.listIterator();
        //Returns true if this list iterator has more elements when traversing the list in the forward direction
        System.out.println("Traversing of elements in the list in a forward direction :");
        while (PersonListIterator.hasNext()) {
            //returns the next element in the list or traverse to the list in a forward direction
            System.out.println(PersonListIterator.next());
        }
        System.out.println();

        //Returns true if this list iterator has more elements when traversing the list in the reverse direction
        System.out.println("Traversing of elements in the list in a backward direction :");
        while (PersonListIterator.hasPrevious()) {
            //Returns the previous element in the list and moves the cursor position backwards
            System.out.println(PersonListIterator.previous());
        }
        System.out.println();


        System.out.println("*");
        //To display the elements in a list
        System.out.println(linkedList);
        //To get the head of a list
        System.out.println(linkedList.peek());
        //To get the first element of a list
        System.out.println(linkedList.getFirst());
        //To remove the element in a first position of the list
        System.out.println(linkedList.removeFirst());
        //To get the size of a list
        System.out.println(linkedList.size());
        //isEmpty() method is to tests the vector has no components
        System.out.println(linkedList.isEmpty());
        //we can loop or traverse through the LinkedList using ListIterator
        //An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, and obtain the iterator's current position in the list
        ListIterator<person> PersonListIterator1 = linkedList.listIterator();
        //Returns true if this list iterator has more elements when traversing the list in the forward direction
        System.out.println("Traversing of elements in the list in a forward direction :");
        while (PersonListIterator1.hasNext()) {
            //returns the next element in the list or traverse to the list in a forward direction
            System.out.println(PersonListIterator1.next());
        }
        //Returns true if this list iterator has more elements when traversing the list in the reverse direction
        System.out.println("Traversing of elements in the list in a backward direction :");
        while (PersonListIterator1.hasPrevious()) {
            //Returns the previous element in the list and moves the cursor position backwards
            System.out.println(PersonListIterator1.previous());
        }
        System.out.println();


        System.out.println("**");
        //To display the elements in a list
        System.out.println(linkedList);
        //To get the head of a list
        System.out.println(linkedList.peek());
        //To get the first element of a list
        System.out.println(linkedList.getLast());
        //To remove the element in a first position of the list
        System.out.println(linkedList.removeLast());
        //To get the size of a list
        System.out.println(linkedList.size());
        //isEmpty() method is to tests the vector has no components
        System.out.println(linkedList.isEmpty());
        System.out.println();


        System.out.println("***");
        //To display the elements in a list
        System.out.println(linkedList);
        //To get the head of a list
        System.out.println(linkedList.peek());
        //To get the element of a list using its index value
        System.out.println(linkedList.get(1));
        //To remove the element  of the list using its index value
        System.out.println(linkedList.remove(1));
        //To get the size of a list
        System.out.println(linkedList.size());
        //isEmpty() method is to tests the vector has no components
        System.out.println(linkedList.isEmpty());
        System.out.println();


        System.out.println("***");
        //To display the elements in a list
        System.out.println(linkedList);
        //To get the head of a list
        System.out.println(linkedList.peek());
        //To get the first element of a list
        System.out.println(linkedList.getFirst());
        //To remove the element in a first position of the list
        System.out.println(linkedList.removeFirst());
        //To get the size of a list
        System.out.println(linkedList.size());
        //isEmpty() method is to tests the vector has no components
        System.out.println(linkedList.isEmpty());
        System.out.println();


        System.out.println("****");
        //To display the elements in a list
        System.out.println(linkedList);
        //To get the head of a list
        System.out.println(linkedList.peek());
        //isEmpty() method is used to tests the vector has no components
        System.out.println(linkedList.isEmpty());



    }



    static record person (String name, int age){

    }

}
