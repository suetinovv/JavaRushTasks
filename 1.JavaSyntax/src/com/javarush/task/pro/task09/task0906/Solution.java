package com.javarush.task.pro.task09.task0906;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = null;
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        int i = 0;
        String s = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                s = (decimalNumber % 2) + s;
                decimalNumber /= 2;
            }
        }
        return s;
    }

    public static int toDecimal(String binaryNumber) {
        int x = 0;
        if ((binaryNumber != null) && (binaryNumber.length() > 0)) {
            String[] arrayStr = binaryNumber.split("");
            for (int i = 0; i < arrayStr.length; i++) {
                x += (Integer.parseInt(arrayStr[arrayStr.length - 1 - i]) % 2) * Math.pow(2, i);
            }
        }
        return x;
    }
}
