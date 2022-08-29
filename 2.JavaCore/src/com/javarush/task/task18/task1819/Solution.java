package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Text> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        BufferedReader buff1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader buff2 = new BufferedReader(new FileReader(fileName2));
        while (buff2.ready()){
            list.add(new Text(buff2.readLine()));
        }
        while (buff1.ready()){
            list.add(new Text(buff1.readLine()));
        }
        buff1.close();
        buff2.close();
        bufferedReader.close();
        FileWriter fileWriter = new FileWriter(fileName1);
        for (Text text:list) {
            fileWriter.write(text.name);
        }
        fileWriter.close();
    }

    public static class Text{
        String name;
        public Text(String name){
            this.name = name;
        }
    }
}
