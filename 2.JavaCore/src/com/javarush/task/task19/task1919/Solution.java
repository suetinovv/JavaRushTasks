package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader buff = new BufferedReader(fileReader);
        TreeMap<String, Double> list = new TreeMap<>();
        while (buff.ready()){
            String[] str = buff.readLine().split(" ");
            if (list.containsKey(str[0])){
                Double d = list.get(str[0]) + Double.parseDouble(str[1]);
                list.replace(str[0],d);
            } else {
                list.put(str[0], Double.parseDouble(str[1]));
            }
        }
        for(Map.Entry e : list.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
        fileReader.close();
    }
}
