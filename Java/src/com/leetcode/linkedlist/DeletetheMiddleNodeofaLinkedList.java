package com.leetcode.linkedlist;

public class DeletetheMiddleNodeofaLinkedList {
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

    public static ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode previous = null;

        if (head == null || head.next == null) {
            return null;
        }

        while( fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = slow.next;


        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "---> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next =  new ListNode(3);
        head.next.next =  new ListNode(4);
        head.next.next.next =  new ListNode(7);
        printList(deleteMiddle(head));

    }
}
