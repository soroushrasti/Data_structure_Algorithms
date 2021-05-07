package com.codewithmosh;

import java.util.NoSuchElementException;

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
    private int size;

     // add first
    public void addFirst(int value){
        var node=new Node(value);
        if(first==null){
            first=last=node;
        }
        else{
            node.next=first;
            first=node;
        }
          size++;
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

        size++;
    }
    // delete first
    public void RemoveFirst(){
        // [10 -> 20 -> 30]
        // [10 20 -> 30]
        // [20 -> 30]
        if (first==null){
            throw new NoSuchElementException();
        }
        if (first==last){
            first=last=null;
            size=0;
        }
        var second=first.next; //20
        first.next=null;
        first=second;
        size--;
    }
    // delete last
    public void removeLast(){
        // [10->20->30]
        // last ->20
        if (first==null){
            throw new NoSuchElementException();
        }
        if (first==last){
            first=last=null;
            size=0;
            return;
        }
        var previous=getPrevious(last);
        last=previous;
        last.next=null;
       size--;

    }

    private Node getPrevious (Node node){
        var current=first;
        while (current !=null){
            if (current.next==node){
                return node;
            }
            current=current.next;
        }
        return null;
    }
    // contains
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }
    //indexof
    public int indexOf(int value){
        // loop with index; if found return
        int index=0;
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

    //size
    public int size(){
        return size;
    }

    public int [] toArray(){
        int[] array=new int[size];
        var current=first;
        var index=0;
        while (current!=null){
            array[index]=current.value;
            index++;
            current=current.next;
        }
        return array;
    }

}
