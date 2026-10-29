
/*
 * Description:
 * This class implements an array-based stack of integers using the
 * LIFO (Last In, First Out) principle. It supports push, pop, peek,
 * clear, and other utility operations. It also checks for stack
 * overflow and underflow.
 *
 * Programmed by: Stephen Paul L. Tacardon
 * Course/Section: BSIT 2 CN 48160
 * Subject: DATA STRUCTURES AND ALGORITHMS
 *
 * Last Modified: October 28, 2026
 * Version: 1.0
 *
 * Acknowledgements:
 * OpenAI ChatGPT (GPT-6) assisted with implementation guidance,
 * code organization, and debugging suggestions.
 *
 * AI Prompt:
 * "Help me implement an array-based stack in Java with a fixed
 * capacity. Include a constructor, push, pop, peek, isEmpty,
 * isFull, size, capacity, clear, and toArray methods. Handle
 * overflow and underflow with clear error messages and keep the
 * code compatible with a Java Swing Stack Visualizer."
 */

import java.util.Arrays;

public class ArrayStack {

    private int[] stack;
    private int top;
    private int capacity;

    // Creates a stack with a default capacity of 10.
    public ArrayStack() {
        this(10);
    }

    // Creates a stack with the specified capacity.
    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Capacity must be greater than zero."
            );
        }

        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    // Adds an element to the top of the stack.
    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException(
                "Stack overflow! The stack is full."
            );
        }

        stack[++top] = value;
    }

    // Removes and returns the top element.
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException(
                "Stack underflow! The stack is empty."
            );
        }

        return stack[top--];
    }

    // Returns the top element without removing it.
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException(
                "Cannot peek. The stack is empty."
            );
        }

        return stack[top];
    }

    // Checks whether the stack is empty.
    public boolean isEmpty() {
        return top == -1;
    }

    // Checks whether the stack is full.
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Returns the current number of elements.
    public int size() {
        return top + 1;
    }

    // Returns the maximum stack capacity.
    public int capacity() {
        return capacity;
    }

    // Removes all elements from the stack.
    public void clear() {
        top = -1;
    }

    // Returns a copy of the stack contents,
    // ordered from bottom to top.
    public int[] toArray() {
        return Arrays.copyOf(stack, top + 1);
    }
}
