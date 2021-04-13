package dev.ghimire;

import dev.ghimire.exception.NotFoundException;

public class Stack {

    private Node head;

    public Object peek() {
        return head.data;
    }

    public int size() {
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public class Node{
        Object data;
        Node next;
        public Node(Object value){
           this.data=value;
           this.next=null;
        }

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Boolean isEmpty() {
        if(head==null){
            return true;
        }
        return  false;
    }

    public Node push(Object value) {
        Node node = new Node(value);
        Node temp= head;
        if(head==null){
            head = node;
            return head;
        }else{
            head=node;
            head.next=temp;
            return head;
        }

    }

    public Object pop()throws NotFoundException {
        if(head==null){
            throw new NotFoundException();
        }else{
            Node temp = head;
            head=head.next;
            return temp.data;
        }

    }

    public Boolean contains(Object i) {
        Node temp = head;
        while(temp!=null){
            if(temp.data.equals(i)){
                return true;
            }
            else{
                temp=temp.next;
            }
        }
       return false;
    }
}
