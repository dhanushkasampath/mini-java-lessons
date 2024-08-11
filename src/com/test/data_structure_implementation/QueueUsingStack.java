package com.test.data_structure_implementation;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: Add an element to the rear of the queue
    public void enqueue(int value) {
        stack1.push(value);
        System.out.println("Enqueued " + value + " into the queue.");
    }

    // Dequeue operation: Remove and return the front element of the queue
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Return a sentinel value to indicate error
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation: Return the front element of the queue without removing it
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty. Nothing to peek.");
                return -1; // Return a sentinel value to indicate error
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeued element is: " + queue.dequeue());
        System.out.println("Dequeued element is: " + queue.dequeue());

        System.out.println("Front element after dequeuing is: " + queue.peek());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Dequeued element is: " + queue.dequeue());

        System.out.println("Current front element is: " + queue.peek());
    }
}
