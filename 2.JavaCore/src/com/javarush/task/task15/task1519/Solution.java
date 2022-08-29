package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader buff = new BufferedReader(new InputStreamReader(System.in))){
            String str = buff.readLine();
            while (!str.equals("exit")){
                try {
                    if (str.contains(".")){
                        print(Double.parseDouble(str));
                    } else if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128){
                        print(Short.parseShort(str));
                    } else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128){
                        print(Integer.parseInt(str));
                    } else {
                        print(str);
                    }
                } catch (Exception e){
                    print(str);
                }
                str = buff.readLine();
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
