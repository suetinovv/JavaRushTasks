package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(buff.readLine());
        buff.close();
        BufferedReader br = new BufferedReader(fileReader);
        while (br.ready()){
            int count = 0;
            String s = br.readLine();
            String[] str = s.split(" ");
            for (int i = 0; i < str.length; i++) {
                for (String x:words) {
                    if (str[i].equals(x)){
                        count++;
                    }
                }

            }
            if (count == 2){
                System.out.println(s);
            }
        }
        br.close();
        fileReader.close();
    }
}
