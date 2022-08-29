package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        try {
            int count = 0;
            int z = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.indexOf(" ", z + 1) >= 0){
                    z = string.indexOf(" ", z + 1);
                    count++;
                    if (count == 5){
                        break;
                    }
                }
            }
            if (count == 5){
                return string.substring(string.indexOf(" ") + 1, z);
            } else if (count == 4){
                return string.substring(string.indexOf(" ") + 1);
            } else {
                throw new TooShortStringException();
            }
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
