package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String str = url.substring(url.indexOf("?") + 1);
        String per = "";
        ArrayList<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '&'){
                list.add(str.substring(x, i));
                x = i + 1;
            }
        }
        list.add(str.substring(x, chars.length));

        ArrayList<String> list2 = new ArrayList<>();
        for (String lstr:list) {
            if (!lstr.contains("=")){
                list2.add(lstr);
            } else {
                if (lstr.contains("obj=")){
                    per = lstr.substring(4, lstr.length());
                }
                for (int i = 0; i < lstr.length(); i++) {
                    if (lstr.charAt(i) == '='){
                        list2.add(lstr.substring(0, i));
                    }
                }
            }
        }

        for (String v:list2) {
            System.out.print(v + " ");
        }
        System.out.println();
        if (!per.equals("")){
            try {
                double d = Double.parseDouble(per);
                alert(d);
            } catch (Exception e){
                alert(per);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
