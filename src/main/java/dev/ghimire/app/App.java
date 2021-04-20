package dev.ghimire.app;

import dev.ghimire.Stack;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.contains(20));
    }
}
