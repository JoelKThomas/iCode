package com.iLearn.java;

@FunctionalInterface
interface Sum {
    int sum(int a , int b);
}

public class FuncInterface {

    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        //METHOD-1
        Sum s = new Sum() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int a = s.sum(x, y);
        System.out.println(a);

        //METHOD-2
        Sum s2= (int p, int q) -> 2*(p+q);

        int b = s2.sum(x, y);
        System.out.println(b);


        //METHOD-3
        Sum s3= (int d, int e) -> { return 3*(d+e);};

        int c = s3.sum(x, y);
        System.out.println(c);
    }
}
