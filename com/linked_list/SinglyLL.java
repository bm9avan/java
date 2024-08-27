package com.linked_list;

public class SinglyLL {
    private Node head;

    public void insert(int v, int i){
        if(head==null){
//            Node newnode = new Node(v);
//            head=newnode;
            head = new Node(v);
        }else {
            insertUsingRecurtion(v,i,head);
        }
        display();
    }
    private Node insertUsingRecurtion(int v, int i, Node current){
        if(i==0){
            Node newnode = new Node(v,current);
            return newnode;
        }
        Node mayBeNew= insertUsingRecurtion(v,i-1,current.next);
        if(i==1)current.next=mayBeNew;
        return current;
    }

    public void reverse(){
        //using recursion
//        Node temp = head;
//        reverseRecurtion(head);
//        temp.next =null;

        //in-place
        Node prev = null, cur = head, next = head.next;
        while(next!=null){
            cur.next= prev;
//            next.next= cur;
            prev = cur;
            cur = next;
            next = next.next;
        }
        if(cur != null){
            head=cur;
            cur.next= prev;
        }
    }

    private void reverseRecurtion(Node cur) {
        // kunal make use of tail #v.llQ@1.54
        if (cur.next==null){
            head = cur;
            return;
        }
//        if(cur.next != null){
            reverseRecurtion(cur.next);
            cur.next.next = cur;
//        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
