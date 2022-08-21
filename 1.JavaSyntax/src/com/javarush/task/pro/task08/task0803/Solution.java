package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            x = Math.min(x, ints[i]);
        }
        return x;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        return new int[] {console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(),};
    }
}
