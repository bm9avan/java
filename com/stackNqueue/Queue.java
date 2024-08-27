package com.stackNqueue;

public class Queue {
    int DEFALUT_SIZE =10;
    int[] q;
    int f=0,e=0;

    Queue(){
        q= new int[DEFALUT_SIZE];
    }

    public boolean add(int data){
        q[e]=data;
        e=(e+1)%q.length;
        return true;
    }

    public int remove(){
        int r= q[f];
        f=(f+1)%q.length;
        return r;
    }

}
