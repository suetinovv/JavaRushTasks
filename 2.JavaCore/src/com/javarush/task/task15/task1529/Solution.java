package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(result);
    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try (InputStreamReader im = new InputStreamReader(System.in)){
            BufferedReader buff = new BufferedReader(im);
            String str = buff.readLine();
            if (str.equals("helicopter")){
                result = new Helicopter();
            } else if (str.equals("plane")){
                result = new Plane(Integer.parseInt(buff.readLine()));
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
