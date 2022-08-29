package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        switch (args[0]){
            case "-e" :
                while (inputStream.available() > 0){
                    int x = inputStream.read();
                    if (x == 0) {
                        x = 255;
                    } else {
                        x--;
                    }
                    outputStream.write(x);
                }
            case "-d" :
                while (inputStream.available() > 0){
                    int x = inputStream.read();
                    if (x == 255) {
                        x = 0;
                    } else {
                       x++;
                    }
                    outputStream.write(x);
                }
        }
        inputStream.close();
        outputStream.close();
    }

}
