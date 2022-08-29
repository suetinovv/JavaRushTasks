package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (bufferedReader.ready()){
                String fileName = bufferedReader.readLine();
                try (FileInputStream inputStream = new FileInputStream(fileName)) {
                } catch (FileNotFoundException e){
                    System.out.println(fileName);
                    break;
                }
            }
        }
    }
}
