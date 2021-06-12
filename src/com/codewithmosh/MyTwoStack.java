package com.codewithmosh;

import java.util.Arrays;

public class MyTwoStack {
    private int size=10;
    private int[] items= new int[size];
    private int top1=-1;
    private int top2=size;
    // divide the array into stack
    // not two equal 5 but dynamical length
    // only uses  one variable (items)
    //

    public void push1(int value){
        // top1++
        //add value
        if(isFull1()){
            throw new StackOverflowError();
        }
        top1++;
        items[top1]=value;
    }

    public int pop1(){
        //top1--
        //return value
        if(isEmpty1()){
            throw new StackOverflowError();
        }
        top1--;
        return items[top1+1];
    }
    public boolean isEmpty1() {
        return top2 == items.length;
    }
    public boolean isFull1() {
        return top2-1 == top1;
    }


    public void push2(int value){
        ///top2--
        //value
        if(isFull2()){
            throw new StackOverflowError();
        }
        top2++;
        items[top2]=value;
    }

    public int pop2(){
        if(isEmpty2()){
            throw new StackOverflowError();
        }
        top2++;
        return items[top2-1];
    }

    @Override
    public String toString(){
        var cont= java.util.Arrays.copyOfRange(items,0,top1);
        return Arrays.toString(cont);
    }

    public boolean isEmpty2() {
        return top1 == -1;
    }
    public boolean isFull2() {
        return top2-1 == top1;
    }
}
