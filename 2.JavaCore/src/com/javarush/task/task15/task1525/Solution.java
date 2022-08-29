package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try (BufferedReader buff = new BufferedReader(new FileReader(Statics.FILE_NAME))){
            String str;
            while (buff.ready()){
                str = buff.readLine();
                lines.add(str);
            }
        } catch (Exception e){

        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(lines);
    }
}
