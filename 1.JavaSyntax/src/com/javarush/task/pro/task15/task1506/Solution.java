package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            List<String> list = Files.readAllLines(Path.of(scanner.nextLine()));
            char[] c;
            for (String str: list) {
                c = str.toCharArray();
                for (int i = 0; i < c.length; i++) {
                    if ((c[i] != '.') & (c[i] != ',') & (c[i] != ' ')) {
                        System.out.print(c[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

