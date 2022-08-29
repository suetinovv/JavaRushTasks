package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(bufferedReader.readLine()));
        while (br.ready()){
            StringBuilder stringBuilder = new StringBuilder(br.readLine());
            System.out.println(stringBuilder.reverse());
        }
        bufferedReader.close();
        br.close();
    }
}
