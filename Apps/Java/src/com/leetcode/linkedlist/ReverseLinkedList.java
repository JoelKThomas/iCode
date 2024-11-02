package com.leetcode.linkedlist;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(){
        }

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

    }

    public static void printListNode(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val);
            if(temp.next != null){
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        while( current != null){
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println("LinkedList before reverse :");
        printListNode(head);
        ListNode reverseListNode  = reverseLinkedList(head);
        System.out.println("\nLinkedList after reverse :");
        printListNode(reverseListNode);
    }

}
