package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int counter = 0;
        char[] arr = string.toCharArray();
        for (char temp: arr) {
            if (Character.isDigit(temp)) {
                counter++;
            }
        }
       return counter;
    }

    public static int countLetters(String string) {
        int counter = 0;
        char[] arr = string.toCharArray();
        for (char temp: arr) {
            if (Character.isLetter(temp)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countSpaces(String string) {
        int counter = 0;
        char[] arr = string.toCharArray();
        for (char temp: arr) {
            if (Character.isSpaceChar(temp)) {
                counter++;
            }
        }
        return counter;
    }
}
