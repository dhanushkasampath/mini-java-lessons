package com.test.data_structure_implementation;

/**
 * The main methods in a stack are
 * push
 * pop
 * peek
 * isEmpty
 * isFull
 */
public class StackUsingArray {
    private int top;
    private int[] stackArray;
    private int maxSize;

    public StackUsingArray(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;// stack is empty at the beginning
        this.stackArray = new int[maxSize];
    }

    public void push(int value) {
        if(isFull()){
            System.out.println("Stack is not. can not push " + value);
            return;
        }
        stackArray[++top] = value; // This means increment the current top value by 1 and after that pass it as index to stackArray
        System.out.println("pushed " + value + " to stack");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Nothing to pop");
            return -1;
        }
        return stackArray[top--]; // This means passing the top value as index to stackArray and after that decrement the value of top by 1.
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        }
        return stackArray[top];
    }

    public void display() {
        for (int i=top; i>=0; i--) {
            System.out.println(stackArray[i]);
        }
        System.out.println("\n");
    }

    // helper methods
    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(10);

        stackUsingArray.push(5);
        stackUsingArray.push(4);
        stackUsingArray.push(7);
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.push(40);
        stackUsingArray.push(50);

        stackUsingArray.display();
        System.out.println("Top element is(peek): " + stackUsingArray.peek());

        System.out.println("Popped element is: " + stackUsingArray.pop());
        System.out.println("Popped element is: " + stackUsingArray.pop());

        System.out.println("Top element is(peek): " + stackUsingArray.peek());
        stackUsingArray.display();
    }
}
