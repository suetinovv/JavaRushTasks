package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Character> set = new TreeSet<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while (br.ready()){
            String str = br.readLine().toLowerCase();
            for (byte b : str.getBytes()){
                if (b >= 'a' && b <= 'z'){
                    set.add((char) b);
                }
            }
        }
        br.close();
        if (set.size() > 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(set.pollFirst());
            }
        } else {
            while (!set.isEmpty()){
                System.out.print(set.pollFirst());
            }
        }
    }
}
