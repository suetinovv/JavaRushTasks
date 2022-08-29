package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader(args[0]));
        int count = 0;
        while (buff.ready()){
            char c = (char) buff.read();
            if (((c >= 65) & (c <= 90)) | (((c >= 97) & (c <= 122)))) {
                count++;
            }
        }
        buff.close();
        System.out.println(count);
    }
}
