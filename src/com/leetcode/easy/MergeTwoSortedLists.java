package com.leetcode.easy;

import com.leetcode.util.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode resultList = new ListNode();
        ListNode head = resultList;

        mergeTwoLists(list1, list2, resultList);

        return head.next;
    }

    public void mergeTwoLists(ListNode list1, ListNode list2, ListNode resultList) {
        if(list1 == null && list2 == null)
            return;

        Integer list1Val = Integer.MAX_VALUE;
        Integer list2Val = Integer.MAX_VALUE;
        if(list1!=null)
            list1Val = list1.val;

        if(list2!=null)
            list2Val = list2.val;

        if(list1Val <= list2Val) {
            list1= list1.next;
        } else {
            list2 = list2.next;
        }

        resultList.next = new ListNode(Math.min(list1Val, list2Val));
        resultList = resultList.next;

        mergeTwoLists(list1, list2, resultList);
    }


    public static void main(String[] args) {
        ListNode l1c = new ListNode(4);
        ListNode l1b = new ListNode(3, l1c);
        ListNode l1a = new ListNode(1, l1b);


        ListNode l2c = new ListNode(4);
        ListNode l2b = new ListNode(2, l2c);
        ListNode l2a = new ListNode(1, l2b);

/*

        ListNode l1c = new ListNode(3);
        ListNode l1b = new ListNode(4, l1c);
        ListNode l1a = new ListNode(2, l1b);


        ListNode l2c = new ListNode(4);
        ListNode l2b = new ListNode(6, l2c);
        ListNode l2a = new ListNode(5, l2b);
*/

        printListNode(new MergeTwoSortedLists().mergeTwoLists(l1a, l2a));
    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
