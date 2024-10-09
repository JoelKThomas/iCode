package com.leetcode;

public class OddEvenLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void printListNode(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" ----> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }


    public static ListNode oddEvenList(ListNode head) {

        if(head == null ){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
       return head;
    }

    public static void main(String[] args) {

        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode(1);
        head.next =  new OddEvenLinkedList.ListNode(2);
        head.next.next =  new OddEvenLinkedList.ListNode(3);
        head.next.next.next =  new OddEvenLinkedList.ListNode(4);
        head.next.next.next.next =  new OddEvenLinkedList.ListNode(5);
        printListNode(oddEvenList(head));
    }

    }
