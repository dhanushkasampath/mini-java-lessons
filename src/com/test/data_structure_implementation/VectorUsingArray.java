package com.test.data_structure_implementation;

public class VectorUsingArray {

    private int[] array;
    private int size;
    private int capacity;

    public VectorUsingArray() {
        capacity = 10; //This is the default capacity
        array = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        array[size++] = value;
    }

    // Get the element at a specific index
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // Remove the element at a specific index
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Get the current size of the vector
    public int size() {
        return size;
    }

    // Resize the array when capacity is reached
    private void resize() {
        capacity = capacity * 2;    // Double the capacity
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {
        VectorUsingArray vectorUsingArray = new VectorUsingArray();

        vectorUsingArray.add(10);
        vectorUsingArray.add(20);
        vectorUsingArray.add(30);

        System.out.println("Element at index 1: " + vectorUsingArray.get(1)); // Output: 20

        vectorUsingArray.remove(1);

        System.out.println("Element at index 1 after removal: " + vectorUsingArray.get(1)); // Output: 30
        System.out.println("Current size of vector: " + vectorUsingArray.size()); // Output: 2
    }

}
