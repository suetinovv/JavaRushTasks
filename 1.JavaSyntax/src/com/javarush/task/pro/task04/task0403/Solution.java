package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ctr = 0;
        boolean isExit = false;
        while (!isExit) {
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                ctr += x;
            } else if (sc.hasNextLine()) {
                String str = sc.nextLine();
                if (str.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(ctr);
    }
}