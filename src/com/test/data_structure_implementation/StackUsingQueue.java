package com.test.data_structure_implementation;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int value){
        //add the new element to q2
        q2.add(value);

        // Transfer all elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        //swap q1 and q2
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

        System.out.println("Pushed " + value + " to stack.");
    }

    // Remove and return the top element of the stack
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty. Can not pop.");
            return -1;
        }
        return q1.remove();
    }

    // Return the top element without removing
    public int peek() {
        if(q1.isEmpty()){
            System.out.println("Stack is empty. Can not peek.");
            return -1;
        }
        return q1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();

        stackUsingQueue.push(10);
        stackUsingQueue.push(20);
        stackUsingQueue.push(30);

        System.out.println("Top element is: " + stackUsingQueue.peek());

        System.out.println("Popped element is: " + stackUsingQueue.pop());
        System.out.println("Popped element is: " + stackUsingQueue.pop());

        System.out.println("Top element is: " + stackUsingQueue.peek());
    }

}
