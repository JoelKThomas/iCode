package com.leetcode.linkedlist;

public class MaximumTwinSumofaLinkedList {

    public static  class ListNode {
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

    }

    public static void printListNode(ListNode head){
        ListNode temp =head;
        while(temp != null){
            System.out.print(temp.val);
            if(temp.next != null){
                System.out.print("-->");
            }
            temp = temp.next;
        }
        System.out.println();

    }

    public static int pairSum(ListNode head) {

        int maxSum = 0;
          ListNode fast = head;
          ListNode slow = head;
          while( fast != null && fast.next != null){
              fast = fast.next.next;
              slow = slow.next;
          }

          ListNode current = slow;
          ListNode previous = null;
          while(current != null){
              ListNode nextNode = current.next;
              current.next = previous;
              previous = current;
              current = nextNode;
        }

        ListNode first = head;
        ListNode second = previous;
        while(second != null) {
            maxSum = Math.max(first.val + second.val, maxSum);
            first = first.next;
            second = second.next;
        }

          return maxSum;
    }





    public static void main(String[] args) {
        ListNode head = new ListNode(4 , new ListNode(2, new ListNode(3, new ListNode(8 , null))));
        printListNode(head);

        System.out.println(pairSum(head));
    }
}
