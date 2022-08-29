package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            String str = bufferedReader.readLine();
            if (str.startsWith(String.valueOf(args[0]) + " ")){
                System.out.println(str);
                break;
            }
        }
        fileReader.close();
        bufferedReader.close();
    }
}
