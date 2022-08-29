package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        BufferedReader buff = new BufferedReader(fileReader);
        int count = 0;
        while (buff.ready()){
            String[] str = buff.readLine().split("\\W");
            for (int i = 0; i < str.length; i++) {
                if (str[i].equals("world")){
                    count++;
                }
            }
        }
        System.out.println(count);
        buff.close();
        fileReader.close();
        bufferedReader.close();
    }
}
