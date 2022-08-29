package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(buff.readLine());
        int x = 0;
        int y;
        while (input.available() > 0){
            y = input.read();
            if (y > x){
                x = y;
            }
        }
        System.out.println(x);
        input.close();
    }
}
