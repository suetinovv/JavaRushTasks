package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scaner = new Scanner(System.in)) {
            InputStream input = new FileInputStream(scaner.nextLine());
            BufferedReader buff = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
            buff.close();
        } catch(IOException e){
                e.printStackTrace();
        }
    }
}