package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();

        System.out.println((x + y + z) / 3);
    }
}
