package com.Q;

import com.linked_list.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Q143 {
    public static void reorderList(ListNode head) {
        ListNode s=head, f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        // ListNode hh=s; //half head
        ListNode p=s, c=s.next, n;
        s.next= null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        ListNode bp=p, fp=head; //back pointer and front pointer
        while(bp!= null && fp.next != null){
            ListNode t = fp.next;
            fp.next=bp;
            fp= t;
            ListNode t2= bp.next;
            bp.next= t;
            bp=t2;
        }
        // return head;
    }
}
