package com.codewithmosh;

public class LinkedLists {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }

    private Node first;
    private Node last;

     // add first
    public void addFirst(int value){
        var node=new Node(value);
        if(first==null){
            first=last=node
        }
        else{
            node.next=first;
            first=node;
        }

    }
    // add last
    public void addLast(int value){
        //wrap to a node object
       var node= new Node(value);
       //empty or not
        if (first==null){
            first=node;
            last=node;
        }
        else {
            last.next= node;
            last=node;
        }
    }
    // delete first
    // delete last
    // contains
    //indexof
    public void indexOf(int value){
        // loop with index; if found return
        int index=0
        var current=first;
        while (current !=null){
            if (current.value==value){
                return index;
            }
                current=current.next;
                index+=1;
        }
        return -1;

    }

}
