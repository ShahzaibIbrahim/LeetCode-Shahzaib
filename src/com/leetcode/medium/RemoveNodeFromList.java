package com.leetcode.medium;

import com.leetcode.util.ListNode;

/**
 * Remove Nth Node From End of List
 */

public class RemoveNodeFromList {

    // 1, 2, 3, 4
    // p, h
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        int size = listSize(head);
        ListNode prev = head;
        ListNode startNode = head;
        if(size == 1) {
            startNode = null;
        } else {
            while (count < size - n) { // size = 5, remove element 2, 4 - 2
                prev = head;
                head = head.next;
                count++;
            }
            if(size - n == 0) {
                startNode = head.next;
            }
            if(head!=null) {
                prev.next = head.next;
            } else {
                prev.next = null;
            }
        }

        return startNode;
    }

    public int listSize(ListNode head) {
        int count = 0;
        while(head!=null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static void printList(ListNode head) {
        while(head!=null) {
            System.out.println(head);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2; n2.next=n3; n3.next=n4; n4.next=n5;

        printList(new RemoveNodeFromList().removeNthFromEnd(n1, 4));

        /*ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);

        n1.next= n2;
        printList(new RemoveNodeFromList().removeNthFromEnd(n1, 2));*/
    }
}
