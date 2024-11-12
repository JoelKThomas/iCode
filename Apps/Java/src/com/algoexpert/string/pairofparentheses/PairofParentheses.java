package com.algoexpert.string.pairofparentheses;


public class PairofParentheses {

    public static void printParentheses(char[] str, int n, int current, int open, int close) {
        if (close == n) {
            System.out.println(str);
            return;
        }
        if (open > close) {
            str[current] = '}';
            printParentheses(str, n, current + 1, open, close + 1);
        }
        if (open < n) {
            str[current] = '{';
            printParentheses(str, n, current + 1, open + 1, close);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        char[] str = new char[2 * n];
        printParentheses(str, n, 0, 0, 0);
    }
}
