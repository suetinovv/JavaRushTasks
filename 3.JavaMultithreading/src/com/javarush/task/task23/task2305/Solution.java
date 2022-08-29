package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] str = new Solution[2];
        str[0] = new Solution();
        str[0].innerClasses[0] = new InnerClass();
        str[0].innerClasses[1] = new InnerClass();
        str[1] = new Solution();
        str[1].innerClasses[0] = new InnerClass();
        str[1].innerClasses[1] = new InnerClass();
        return str;
    }

    public static void main(String[] args) {

    }
}
