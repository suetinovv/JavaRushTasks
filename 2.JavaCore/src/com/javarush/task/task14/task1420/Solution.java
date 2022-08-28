package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (InputStreamReader input = new InputStreamReader(System.in)) {
            BufferedReader buff = new BufferedReader(input);
            int x = Integer.parseInt(buff.readLine());
            int y = Integer.parseInt(buff.readLine());
            for (int i = Integer.min(x, y); i > 0; i--) {
                if (x % i == 0 && y % i == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
