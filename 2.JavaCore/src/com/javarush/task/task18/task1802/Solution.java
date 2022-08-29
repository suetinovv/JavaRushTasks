package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(buff.readLine());
        int x = Integer.MAX_VALUE;
        int y;
        while (input.available() > 0){
            y = input.read();
            if (y < x){
                x = y;
            }
        }
        System.out.println(x);
        input.close();
    }
}
