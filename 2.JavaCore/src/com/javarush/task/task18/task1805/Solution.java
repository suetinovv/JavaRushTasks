package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(buff.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (file.available() > 0){
            int x = file.read();
            if (!list.contains(x)){
                list.add(x);
            }
        }
        list.sort((o1,o2) -> o1 - o2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i) + " ");
        }
        file.close();
        buff.close();
    }
}
