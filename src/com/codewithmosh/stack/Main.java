package com.codewithmosh.stack;

import com.codewithmosh.MinStack;

public class Main {
    public static void main(String[] args){
        MinStack items = new MinStack();
        items.push(3);
        items.push(4);
        items.push(1);
        items.pop();

        System.out.println(items.min());
    }

}
