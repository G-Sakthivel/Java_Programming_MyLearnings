import java.util.*;
public class WorkingWithStack {
    public static void main(String[] args) {
        //Stack performs LIFO
        //Stack implements both
        // ###vector implementation of operation(Synchronization to slow down the operations when we are working in multithreaded environment) and
        // ###ArrayList implementation of operations

        // 1* Vector implementation of stack
        System.out.println( "Stack implementation by extends vector :");
        //Syntax for using interface and collections in java (collection for implementing stack)
        Stack<Integer> stack = new Stack<>();
        //push() method is used to add elements in a stack
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(15);
        stack.push(47);

        //*
        System.out.println("*");
        //To Display stack
        System.out.println(stack);
        //To get the size of a stack
        System.out.println(stack.size());
        //To get the top element of a stack
        System.out.println(stack.peek());
        //pop() method is to remove elements in a stack(lastly added element is get removed first)
        System.out.println(stack.pop());
        //empty() method is used to check whether the stack is empty or not
        System.out.println(stack.empty());

        //**
        System.out.println("**");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

        //***
        System.out.println("***");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        //isEmpty() method is used to tests if the vector has no components
        System.out.println(stack.isEmpty());

        //****
        System.out.println("****");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

        //*****
        System.out.println("*****");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

        //******
        System.out.println("******");
        System.out.println(stack);
        System.out.println(stack.size());
        //System.out.println(stack.peek());// our stack is empty therefore this makes error - EmptyStackException and it won't be executed
        System.out.println(stack.empty());

        for (int i = 0; i <=50; i++) {
            System.out.print("_");
        }
        System.out.println();

        //2* List implementation of stack
        System.out.println("List Implementation of a stack :");
        List<Integer> stack1 = new Stack<>();
        //add() method is used to add elements in a list implementation of stack
        stack.add(3);
        stack.add(5);
        stack.add(7);
        stack.add(15);
        stack.add(47);

        //*
        System.out.println("*");
        //To Display stack
        System.out.println(stack);
        //To get the size of a stack
        System.out.println(stack.size());
        //To get the Last element of a stack
        System.out.println(stack.getLast());
        //remove(index) method is to remove elements in a stack using its index value
        System.out.println(stack.remove(2) );
        //isEmpty() method is used to check whether the stack is empty or not
        System.out.println(stack.isEmpty());

        //**
        System.out.println("**");
        System.out.println(stack);
        System.out.println(stack.size());
        //To get the Last element of a stack
        System.out.println(stack.getLast());
        //To remove last element of a stack
        System.out.println(stack.removeLast());
        System.out.println(stack.isEmpty());

        //***
        System.out.println("***");
        System.out.println(stack);
        System.out.println(stack.size());
        //To get first element of a stack
        System.out.println(stack.getFirst());
        //To remove first element of a stack
        System.out.println(stack.removeFirst());
        //isEmpty() method is used to tests if the vector has no components
        System.out.println(stack.isEmpty());

        //****
        System.out.println("****");
        System.out.println(stack);
        System.out.println(stack.size());
        //get(index) method is used to get an element in a stack using its index value
        System.out.println(stack.get(0));
        //To remove elements of a stack using its index value
        System.out.println(stack.remove(0));
        System.out.println(stack.empty());


        //*****
        System.out.println("*****");
        System.out.println(stack);
        System.out.println(stack.size());
        //removeAllElements() is a method which is used to remove all the elements in a List implementation of stack
        stack.removeAllElements();
        System.out.println(stack.isEmpty());

        //******
        System.out.println("******");
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }
}
