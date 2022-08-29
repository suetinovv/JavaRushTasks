package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        BufferedReader buff = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        while (buff.ready()){
            String str = buff.readLine().replaceAll("\\p{Punct}", "");
            bw.write(str);
        }
        bw.close();
        fileReader.close();
        fileWriter.close();
        buff.close();
        bufferedReader.close();
    }
}
