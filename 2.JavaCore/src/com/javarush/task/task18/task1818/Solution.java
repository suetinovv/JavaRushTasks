package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter1 = new FileWriter(bufferedReader.readLine(), true);
        FileReader fileReader2 = new FileReader(bufferedReader.readLine());
        FileReader fileReader3 = new FileReader(bufferedReader.readLine());
        while (fileReader2.ready()){
            fileWriter1.write(fileReader2.read());
        }
        while (fileReader3.ready()){
            fileWriter1.write(fileReader3.read());
        }
        fileWriter1.flush();
        fileWriter1.close();
        fileReader2.close();
        fileReader3.close();
    }
}
