package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int countAll = 0;
        int countProbel = 0;
        while (fileReader.ready()){
            int i = fileReader.read();
            if (i == ' '){
                countProbel++;
            }
            countAll++;
        }
        System.out.printf("%.2f", (double) countProbel / (double) countAll * 100.00);
        fileReader.close();
    }
}
