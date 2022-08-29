package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(buff.readLine());
        FileOutputStream outputStream = new FileOutputStream(buff.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0){
            list.add(inputStream.read());
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            outputStream.write(list.get(i));
        }
        inputStream.close();
        outputStream.close();
        buff.close();
    }
}
