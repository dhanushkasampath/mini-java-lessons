package com.test.data_structure_implementation;

/**
 * We need to implement 3 main methods
 * enqueue - Add an element to the rear of the queue
 * dequeue - Remove and return the front element of the queue
 * peek - Return the front element of the queue without removing it
 */
public class QueueUsingArray {
    private int[] queueArray;  // Array to store queue elements
    private int front;         // Index of the front element
    private int rear;          // Index of the rear element
    private int size;          // Current size of the queue
    private int capacity;      // Capacity of the queue


    public QueueUsingArray(int capacity){
        this.capacity = capacity; // initial capacity of the queue
        queueArray = new int[capacity]; //create an array with given capacity
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full. Can not enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
        System.out.println("Enqueue " + value + " into the queue.");
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Can not dequeue");
            return -1;
        }
        int value = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queueArray[front];
    }

    // check if the queue is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // check if the queue is full
    public boolean isFull(){
        return size == capacity;
    }

    // get the current size of the queue
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(10);

        queueUsingArray.enqueue(10);
        queueUsingArray.enqueue(20);
        queueUsingArray.enqueue(30);
        queueUsingArray.enqueue(40);
        queueUsingArray.enqueue(50);

        System.out.println("Front element is: " + queueUsingArray.peek());

        System.out.println("Dequeued element is: " + queueUsingArray.dequeue());
        System.out.println("Dequeued element is: " + queueUsingArray.dequeue());

        System.out.println("Front element after dequeuing is: " + queueUsingArray.peek());

        queueUsingArray.enqueue(60);
        queueUsingArray.enqueue(70);

        System.out.println("Current size of queue: " + queueUsingArray.size());
    }
}
