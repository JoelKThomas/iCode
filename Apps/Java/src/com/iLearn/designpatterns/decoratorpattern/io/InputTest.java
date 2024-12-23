package com.iLearn.designpatterns.decoratorpattern.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("F:\\Studyroom\\iCode\\Java\\src\\com\\iLearn\\designpatterns\\decoratorpattern\\io\\test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
