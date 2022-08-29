package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        BufferedReader buff = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        while (buff.ready()){
            String[] str = buff.readLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                try {
                    list.add(Integer.parseInt(str[i]));
                } catch (Exception e){
                    continue;
                }
            }
        }
        for (Integer x:list) {
            bw.write(String.format("%d ", x));
        }
        fileReader.close();
        fileWriter.close();
        buff.close();
        bufferedReader.close();
        bw.close();
    }
}
