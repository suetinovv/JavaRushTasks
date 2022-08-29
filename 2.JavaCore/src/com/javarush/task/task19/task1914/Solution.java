package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String str = outputStream.toString();
        System.setOut(console);
        String[] str1 = (str.split(" "));
        int result = 0;
        switch (str1[1]){
            case "+" :
                result = Integer.parseInt(str1[0]) + Integer.parseInt(str1[2]);
                break;
            case "-" :
                result = Integer.parseInt(str1[0]) - Integer.parseInt(str1[2]);
                break;
            case "*" :
                result = Integer.parseInt(str1[0]) * Integer.parseInt(str1[2]);
                break;
        }
        str = str1[0] + " " + str1[1] + " " + str1[2] + " " + str1[3]  + " " + result;
        System.out.print(str);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

