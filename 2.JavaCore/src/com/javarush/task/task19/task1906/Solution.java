package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        int count = 1;
        while (fileReader.ready()){
            int x = fileReader.read();
            if (count % 2 == 0){
                fileWriter.write(x);
            }
            count++;
        }
        fileReader.close();
        fileWriter.close();
        bufferedReader.close();
    }
}
