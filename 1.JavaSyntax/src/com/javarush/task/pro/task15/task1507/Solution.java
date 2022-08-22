package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            Path path = Path.of(scanner.nextLine());
            List<String> list = Files.readAllLines(path);
            int  x = 1;
            for (String str: list) {
                if (x % 2 == 1) {
                    System.out.println(str);
                }
                x++;
            }
        }
    }
}

