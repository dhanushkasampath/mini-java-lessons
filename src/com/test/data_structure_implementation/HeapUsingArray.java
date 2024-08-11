package com.test.data_structure_implementation;

public class HeapUsingArray {
    private int[] heapArray; // Array to store heap elements
    private int size;        // Current number of elements in the heap
    private int capacity;    // Capacity of the heap

    // Constructor: Initialize the heap with a given capacity
    public HeapUsingArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heapArray = new int[capacity];
    }

    // Get the index of the parent of the node at index i
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get the index of the left child of the node at index i
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get the index of the right child of the node at index i
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Insert a new element into the heap
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert " + value);
            return;
        }

        // Insert the new element at the end of the heap
        size++;
        int i = size - 1;
        heapArray[i] = value;

        // Fix the max heap property if it is violated
        while (i != 0 && heapArray[parent(i)] < heapArray[i]) {
            int temp = heapArray[i];
            heapArray[i] = heapArray[parent(i)];
            heapArray[parent(i)] = temp;

            i = parent(i);
        }

        System.out.println("Inserted " + value + " into the heap.");
    }

    // Extract the maximum element (root) from the heap
    public int extractMax() {
        if (size <= 0) {
            System.out.println("Heap is empty. Cannot extract.");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            size--;
            return heapArray[0];
        }

        // Store the maximum value and remove it from the heap
        int root = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;

        // Heapify the root element to maintain the max heap property
        heapify(0);

        return root;
    }

    // Heapify a subtree rooted with node i
    private void heapify(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heapArray[left] > heapArray[largest]) {
            largest = left;
        }

        if (right < size && heapArray[right] > heapArray[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = heapArray[i];
            heapArray[i] = heapArray[largest];
            heapArray[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(largest);
        }
    }

    // Get the maximum element (root) of the heap without removing it
    public int getMax() {
        if (size <= 0) {
            System.out.println("Heap is empty. Cannot get maximum.");
            return Integer.MIN_VALUE;
        }
        return heapArray[0];
    }

    public static void main(String[] args) {
        HeapUsingArray maxHeap = new HeapUsingArray(10);

        maxHeap.insert(3);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(1);
        maxHeap.insert(7);

        System.out.println("Maximum element is: " + maxHeap.getMax());

        System.out.println("Extracted maximum element: " + maxHeap.extractMax());
        System.out.println("Maximum element after extraction: " + maxHeap.getMax());
    }
}
