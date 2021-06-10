package com.codewithmosh.stack;

import com.codewithmosh.Stack;

public class Main {
    public static void main(String[] args){
        Stack stack= new Stack();
        stack.push(3);
        stack.push(5);

        System.out.println(stack.pop());
    }

}
