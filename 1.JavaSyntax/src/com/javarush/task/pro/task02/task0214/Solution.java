package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str1 = keyboard.nextLine();
        String str2 = keyboard.nextLine();
        String str3 = keyboard.nextLine();

        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
