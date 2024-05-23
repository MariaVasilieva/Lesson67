package org.example;

import java.util.ArrayList;

public class StackSet {
    private ArrayList<Stack> stacks = new ArrayList<>();
    private int maxAmount;
    private int counter;
    public StackSet(int maxAmount){
        this.maxAmount=maxAmount;
        this.counter = 0;
    }
    public void push(int data){
        if(counter == 0){
            Stack stack = new Stack();
            stack.push(data);
            stacks.add(stack);
            counter++;
        }
        else {
            stacks.get(stacks.size()-1).push(data);
            counter++;
        }
        if(counter==maxAmount){
            counter=0;
        }
    }
    //TODO
    public int pop(){
        return -1;
    }
}
