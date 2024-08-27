package com.linked_list;

import com.Q.Q143;

public class ListNode {
   int val;
     public ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode head =new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        Q143.reorderList(head);
      }
  }
