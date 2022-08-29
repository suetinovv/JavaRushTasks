package com.javarush.task.task19.task1909;

import java.io.*;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        BufferedReader buff = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        while (buff.ready()){
            int x = buff.read();
            if (x == '.'){
                x = '!';
            }
            bw.write(x);
        }
        bw.close();
        fileReader.close();
        fileWriter.close();
        buff.close();
        bufferedReader.close();
    }
}
