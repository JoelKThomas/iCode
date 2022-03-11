package com.competitive.linkedlist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static class LinkedList {

        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }

        public LinkedList removeDuplicatesFromLinkedList() {
            LinkedList currentNode = this;
            while (currentNode != null) {
                LinkedList nextNode = currentNode.next;
                while (nextNode != null && nextNode.value == currentNode.value) {
                    nextNode = nextNode.next;
                }
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
            return this;
        }

        public LinkedList addAll( List<Integer> values) {
            LinkedList current = this;
            while (current.next != null) {
                current = current.next;
            }
            for (int value : values) {
                current.next = new LinkedList(value);
                current = current.next;
            }
            return this;
        }


    }

    public static void print(LinkedList ll) {
        LinkedList current = ll;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LinkedList input = new LinkedList(1);
        input.addAll(new ArrayList<>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        print(input.removeDuplicatesFromLinkedList());
    }
}
