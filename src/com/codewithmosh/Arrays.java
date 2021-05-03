package com.codewithmosh;

public class Arrays {
    private int[] items;
    private int count;
    public Arrays(int length){

        items= new int[length];
    }
    public void insert(int value){
        // if the array is full; resize it
        // add new item at the end of current item
        if (count==items.length){
            // create a new array (twise size)
            int[] new_items=new int[count*2];
            // copy all existing items into this new array
            for (int i=0; i<count;i++){
                new_items[i]=items[i];
            }
            //set 'items' to this new array
            items=new_items;
        }
        items[count++]=value;
    }
    //    return items.length;
    //}
    public void print(){
        for (int i=0; i<count;i++)
            System.out.println(items[i]);
    }
    public void removeAt(int index){
        //validate the index
        if (index<0 || index>=count)
            throw new IllegalArgumentException();
        // shift the items to the left to fill the whole
        for (int i=index; i<count;i++){
            items[i]=items[i+1];}
        count--;
    }
    public int IndexOf(int value){
        // loop over all items, if found item return the index
        //otherwise return -1
        for (int i=0; i<count;i++) {
            if (items[i] == value)
                return i;
        }
        return -1;
    }
}
