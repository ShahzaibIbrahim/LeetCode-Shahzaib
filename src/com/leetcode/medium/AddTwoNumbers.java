package com.leetcode.medium;

import com.leetcode.util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode head = null;
        int carry = 0;
        while(true) {
            int sum = (l1==null? 0 : l1.val) + (l2==null? 0 : l2.val) + carry;
            int resultVal = sum%10;
            carry = sum/10;

            if(l1== null && l2 == null) {
                if(resultVal>0) {
                    result.next = new ListNode(resultVal);
                }
                break;
            }

            if(result == null) {
                result = new ListNode(resultVal);
                head = result;
            } else {
                result.next = new ListNode(resultVal);
                result = result.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }

    public static void printListNode(ListNode listNode) {
        while(listNode !=null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1g = new ListNode(9);
        ListNode l1f = new ListNode(9,l1g);
        ListNode l1e = new ListNode(9, l1f);
        ListNode l1d = new ListNode(9, l1e);
        ListNode l1c = new ListNode(9, l1d);
        ListNode l1b = new ListNode(9, l1c);
        ListNode l1a = new ListNode(9, l1b);


        ListNode l2d = new ListNode(9);
        ListNode l2c = new ListNode(9, l2d);
        ListNode l2b = new ListNode(9, l2c);
        ListNode l2a = new ListNode(9, l2b);

/*

        ListNode l1c = new ListNode(3);
        ListNode l1b = new ListNode(4, l1c);
        ListNode l1a = new ListNode(2, l1b);


        ListNode l2c = new ListNode(4);
        ListNode l2b = new ListNode(6, l2c);
        ListNode l2a = new ListNode(5, l2b);
*/

        printListNode(new AddTwoNumbers().addTwoNumbers(l1a, l2a));
    }
}
