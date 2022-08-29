package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(buff.readLine());
        int count = 0;
        int x;
        while (inputStream.available() > 0){
            x = inputStream.read();
            if (x == ','){
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
        buff.close();
    }
}
