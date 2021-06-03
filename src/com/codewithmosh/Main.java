package com.codewithmosh;

public class Main {
    public static void main(String[] args){
        LinkedLists list= new LinkedLists();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        var a=list.getKthFormEnd(1);
        System.out.print(a);

    }
}
