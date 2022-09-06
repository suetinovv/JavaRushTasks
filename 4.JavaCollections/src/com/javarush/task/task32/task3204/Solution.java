package com.javarush.task.task32.task3204;

import java.io.*;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream osb = new ByteArrayOutputStream();
        int count = 3;
        osb.write(minChar());
        osb.write(maxChar());
        osb.write(aNumber());
        while (count < 8){
            Random r = new Random();
            int x = r.nextInt(3);
            switch (x){
                case 0 :
                    osb.write(minChar());
                    count++;
                    break;
                case 1 :
                    osb.write(maxChar());
                    count++;
                    break;
                case 2 :
                    osb.write(aNumber());
                    count++;
                    break;
            }
        }
        return osb;
    }

    public static char aNumber(){
        Random r = new Random();
        while (true){
            int x = r.nextInt(58);
            if (x >= '0' && x <= '9'){
                return (char) x;
            }
        }
    }
    public static char minChar(){
        Random r = new Random();
        while (true){
            int x = r.nextInt(123);
            if (x >= 'a' && x <= 'z'){
                return (char) x;
            }
        }
    }
    public static char maxChar(){
        Random r = new Random();
        while (true){
            int x = r.nextInt(91);
            if (x >= 'A' && x <= 'Z'){
                return (char) x;
            }
        }
    }
}
