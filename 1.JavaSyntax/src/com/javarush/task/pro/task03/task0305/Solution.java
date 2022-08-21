package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x == y) {
            if (x == z) {
            System.out.println(x + " " + y + " " + z);
            } else {
            System.out.println(x + " " + y);
            }
        } else if (x == z) {
            System.out.println(x + " " + z);
        } else if (y == z) {
            System.out.println(y + " " + z);
        }
    }
}
