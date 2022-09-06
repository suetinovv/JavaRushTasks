package com.javarush.task.task30.task3010;

import java.util.regex.Pattern;

/* 
Минимальное допустимое основание системы счисления
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String str = args[0];
            int result = 2;
            if (Pattern.matches("[0-9A-Za-z]+", str)){
                char[] chars = str.toUpperCase().toCharArray();
                int max = '1';
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] > max){
                        max = chars[i];
                    }
                }
                if (max > '1' && max < '9'){
                    result = max - 47;
                }
                else if(max >= 'A' && max <= 'Z'){
                    result = max - 54;
                }
                System.out.println(result);
            } else {
                System.out.println("incorrect");
            }
        } catch (Exception e){
            
        }


    }
}