package org.example;

public class Stack {
    class Node{
        int data;
        Node prev;
        Node(int data){
            this.data = data;
        }
        Node(int data, Node prev){
            this.data = data;
            this.prev = prev;
        }
    }
    private Node top;
    public void push(int data){
        Node newNode = new Node(data, top);
        top = newNode;
    }
    public int pop(){
        if(top!=null){
            int data = top.data;
            top = top.prev;
            return data;
        }
        else{
            return -1;
        }
    }
}
