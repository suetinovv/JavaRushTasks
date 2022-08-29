package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String str = outputStream.toString();
        System.setOut(console);
        System.out.println(str);
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(buff.readLine());
        out.write(str.getBytes());
        out.close();
        buff.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

