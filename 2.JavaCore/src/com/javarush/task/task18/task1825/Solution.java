package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String str = buff.readLine();
            if (!str.equals("end")){
                list.add(str);
            } else {
                break;
            }
        }

        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });
        String fileName = list.get(0).substring(0, list.get(0).length() - 6);
        File newFile = new File(fileName);
        FileOutputStream outputStream = new FileOutputStream(newFile);
        for (int i = 0; i < list.size(); i++) {
            FileInputStream inputStream = new FileInputStream(list.get(i));
            byte[] buffer = new byte[1000];
            while (inputStream.available() > 0){
                int x = inputStream.read(buffer);
                outputStream.write(buffer, 0, x);
            }
            inputStream.close();
        }
        buff.close();
        outputStream.close();
    }
}
