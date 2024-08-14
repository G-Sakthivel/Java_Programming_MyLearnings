import java.util.*;
public class WorkingWithQueue {
    public static void main (String [] args) {
        System.out.println("LinkedList Implementation of Queue :");
        //Queue performs FIFO logic
        //Queue using LinkedList implementation --> Head is first element's pos of the queue and Tail is last element's pos of the queue
        // (Interface - Queue) and (Collections - LinkedList)
        Queue<person> queue = new LinkedList<>();
        //add() method is used to insert an element into the queue
        queue.add(new person("Mahi",18) );
        queue.add(new person("shakthi", 20));
        //offer() method is used to add specified elements into a queue
        // When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        queue.offer(new person("Dhoni",40));

        System.out.println("*");
        //To display the elements of the queue
        System.out.println(queue);
        //To get the size of the queue
        System.out.println(queue.size());
        //To get the top most or the first element of the queue
        System.out.println(queue.peek());
        //isEmpty() method is used to tests if the vector has no components or elements
        System.out.println(queue.isEmpty());
        //poll() is the method which retrieves and removes the element of a queue (First element can be removed first)
        //poll() returns null if the queue is empty
        System.out.println(queue.poll());
        System.out.println();

        System.out.println("**");
        System.out.println(queue);
        System.out.println((queue.size()));
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        //remove() is the method used to retrieves and removes the head of the queue
        //But it throws an exception if this queue is empty
        System.out.println(queue.remove());
        System.out.println();

        System.out.println("***");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.poll());
        System.out.println();

        System.out.println("****");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.poll());
        System.out.println();

    }


    static record person(String name, int age){

    }
}
