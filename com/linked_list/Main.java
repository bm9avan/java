package com.linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLL obj = new SinglyLL();
//        CirculerLL obj = new CirculerLL();

//        SinglyLL.Node o = obj.new Node(10);   //way to assess nested class
//        System.out.println("Hello world!");

        obj.insert(10,0);
        obj.insert(20,1);
        obj.insert(30,1);
        obj.insert(60,3);
        obj.insert(30,1);
        obj.insert(80,4);
        obj.reverse();
        obj.display();

//        obj.insert(10,0); obj.display();
//        obj.insert(20,1); obj.display();
//        obj.insert(30,1); obj.display();
//        obj.delete(1); obj.display();
    }
}