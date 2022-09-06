package com.javarush.task.task32.task3201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            if (raf.length() > number){
                raf.seek(number);
            } else {
                raf.seek(raf.length());
            }
            raf.write(text.getBytes());
            raf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
