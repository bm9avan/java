package com.linked_list;

public class CirculerLL {
    private Node head;
    private Node tail;
    int size=0;

    public void insert(int v, int i){
        if(head == null){
            System.out.println(v+" "+i);
            head = tail = new Node(v);
            head.next= tail;
            size++;
            return;
        }
        if(i==0){
            tail.next=new Node(v, head);
            head=tail.next;
            size++;
            return;
        }
        Node newNode = new Node(v);
        if(size==i)tail=newNode;
        Node temp = head;
        Node prev=tail;
        while (i!=0){
            prev=temp;
            temp=temp.next;
            i--;
        }
//        if (temp == tail){
//            temp.next=new Node(v, head);
//        }
        newNode.next= temp;
        prev.next = newNode;
        size++;
    }

    public int delete(int i){
        if(head==null) return -1;
        Node temp = head;
        Node prev=tail;
        while (i!=0){
            prev=temp;
            temp=temp.next;
            i--;
        }
        if (prev==tail){
//            tail.next=head.next;
            head=head.next;
        }
        if (temp==tail){
            tail=prev;
        }
        prev.next=temp.next;
        return temp.value;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            System.out.print("start:"+temp.value+" ->");
            temp = temp.next;
        }
        while (temp != head){
            System.out.print(temp.value+" ->");
            temp = temp.next;
        }
        System.out.println("Head");
    }
    class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
