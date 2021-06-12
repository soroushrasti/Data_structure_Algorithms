package com.codewithmosh;


public class MyminStack {
    private Stack items = new Stack();
    private Stack orderedItems = new Stack();

    public void push(int item) {
        items.push(item);

        //add value to orderedItems in an ordered way
        if (orderedItems.isEmpty()){
            orderedItems.push(item);
        }else if(item < orderedItems.peek()){
                orderedItems.push(item);
            }
    }

    public int pop() {
        var top=items.pop();

        if( orderedItems.peek()==top){
            orderedItems.pop();
        }
        return top;
    }
    public int min(){
        return orderedItems.peek();
    }


}
