package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
        double d1 = 100.0;
        double d2 = 0.0;
        div(d2, d1);
        div(-d2, d1);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
