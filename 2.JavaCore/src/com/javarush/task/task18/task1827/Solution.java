package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Прайсы
*/

public class Solution {


    public static void main(String[] args) throws Exception {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buff.readLine();
        buff.close();
        FileReader reader = new FileReader(fileName);
        FileWriter writer = new FileWriter(fileName, true);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Integer> list = new ArrayList<>();

        if (args.length != 0){
            if (args[0].equals("-c")) {
                while (buffer.ready()){
                    list.add(Integer.parseInt(buffer.readLine().substring(0, 8).trim()));
                }
                buffer.close();
                reader.close();
                int maxId = list.get(0);
                for (int x:list) {
                    if (maxId < x) maxId = x;
                }
                maxId++;
                String name;
                if (args[1].length() > 30) {
                    name = args[1].substring(0, 30);
                } else{
                    name = args[1];
                }
                String str = String.format("%c%-8d%-30s%-8.2f%-4d",'\n', maxId, name, Double.parseDouble(args[2]), Integer.parseInt(args[3]));
                writer.write(str);
            }
        }
        writer.close();
    }
}
