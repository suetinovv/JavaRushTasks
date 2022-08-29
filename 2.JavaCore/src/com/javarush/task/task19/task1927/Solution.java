package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputStream);
        System.setOut(ps);
        testString.printSomething();
        String[] str = outputStream.toString().split("\n");
        System.setOut(printStream);
        for (int i = 0; i < str.length ; i++) {
            System.out.println(str[i]);
            if (i % 2 == 1){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }
        ps.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
