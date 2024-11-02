package com.codingexams.paypal.addtwonumbers;

class LinkedList {
    int data;
    LinkedList next;

    LinkedList(int value) {
        this.data = value;
    }
}


public class LinkedListPaypal {


    static int sum(LinkedList current) {
        int sum = 0;
        while (current.next != null) {
            int value = current.data;
            sum = sum * 10 + value;
            current = current.next;
        }
        return sum;
    }


    static LinkedList createList(int value) {
        int n = value;
        LinkedList current = new LinkedList(n % 10);
        if (n < 0) {
            current.next = null;
        } else {
            current.next = createList( n / 10);
        }
        return current;
    }

    static LinkedList calculateSum(LinkedList l1, LinkedList l2) {
        int totalSum = sum(l1) + sum(l2);
        return createList(totalSum);
    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(2);
        l1.next = new LinkedList(4);
        l1.next.next = new LinkedList(3);

        LinkedList l2 = new LinkedList(5);
        l2.next = new LinkedList(6);
        l2.next.next = new LinkedList(4);

        LinkedList result = calculateSum(l1, l2);
        System.out.println(result);
    }
}

