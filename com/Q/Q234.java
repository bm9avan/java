package com.Q;
//2for break
public class Q234 {
    private ListNode head;
    public void insert(int v, int i){
        if(head==null){
//            ListNode newnode = new ListNode(v);
//            head=newnode;
            head = new ListNode(v);
        }else {
            insertUsingRecurtion(v,i,head);
        }
        display();
    }
    private ListNode insertUsingRecurtion(int v, int i, ListNode current){
        if(i==0 || current == null){
            ListNode newnode = new ListNode(v,current);
            return newnode;
        }
        ListNode mayBeNew= insertUsingRecurtion(v,i-1,current.next);
        if(i==1)current.next=mayBeNew;
        return current;
    }

    public void reverse(){
        //using recursion
//        ListNode temp = head;
//        reverseRecurtion(head);
//        temp.next =null;

        //in-place
        ListNode prev = null, cur = head, next = head.next;
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

    private void reverseRecurtion(ListNode cur) {
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
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.value+" ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class ListNode{
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    static int r=0,l=0;

    public static void main(String[] args) {
        Q234 obj = new Q234();

        obj.insert(10,0);
        obj.insert(40,1);
        obj.insert(30,1);
        obj.insert(20,1);
//        obj.insert(60,4);
//        obj.insert(80,5);
//        reverseBetween(obj.head, 2,4);
        reverseBetween(obj.head, 1,1);
        obj.display();
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        System.out.println(head);
        if(head == null) return null;
        r=right;
        l=left;
        ListNode temp = head, pre= null;
        while(left != 1){
            pre =temp;
            temp = temp.next;
            left--;
        }
        ListNode[] rr = recurtion(temp);
        temp.next = rr[1];
        if(pre != null){ pre.next = rr[0];}else {head = rr[0];}
        return head;
    }

    public static ListNode[] recurtion(ListNode temp){
        if(r == l){
            return new ListNode[]{temp, temp.next};
        }
        r--;
        ListNode[] rr= recurtion(temp.next);
        temp.next.next = temp;
        return rr;
    }

    public static boolean isPalindrome(ListNode head) {
        //find mid
        ListNode st=head,s=head, f= head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        //reverse from mid
        ListNode mid=s,pre= s, cur = s.next, next= null;
        if(cur!=null){
            next = cur.next;
        }
        while(next != null){
            cur.next=pre;
            pre=cur;
            cur=next;
            next=next.next;
        }
        //check mid and start
        while(mid.next!=null){
            if(st.value != mid.value){
                return false;
            }
            st=st.next;
            mid=mid.next;
        }
        return true;
    }
}