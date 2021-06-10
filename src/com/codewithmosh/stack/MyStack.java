package com.codewithmosh.stack;

import com.codewithmosh.Stack;

import java.util.Arrays;

public class MyStack {
    private int[] items= new int[5];
    private int count;
    public void push(int value){
        if(items.length==count){
            throw new StackOverflowError();
        }
        items[count]=value;
        count++;
    }

    public int pop(){
        if(items.length==0){
            throw new StackOverflowError();
        }
        count--;
        return items[count];
    }
    @Override
    public String toString(){
        var cont= Arrays.copyOfRange(items,0,count);
        return Arrays.toString(cont);
    }
    public int peek(){
        if(items.length==0){
            throw new StackOverflowError();
        }
        return items[count-1];
    }


}
