package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(args[1]);
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while (br.ready()){
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                for(char c: str[i].toCharArray()) {
                    if(Character.isDigit(c)){
                        fw.write(str[i] + " ");
                        break;
                    }
                }
            }
        }
        fw.close();
        br.close();
    }
}
