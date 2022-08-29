package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter(args[1]);
        StringBuilder result = new StringBuilder();
        while (br.ready()){
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                if (s.length() > 6) {
                    result.append(s).append(",");
                }
            }
        }
        fw.write(result.substring(0, result.length() - 1));
        br.close();
        fw.close();
    }
}
