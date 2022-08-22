package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            Path path;
            String str;
            while (true) {
                str = scanner.nextLine();
                path = Path.of(str);
                if (Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.isDirectory(path)){
                    System.out.println(path.toString() + THIS_IS_DIR);
                } else {
                    break;
                }
            }
        }
        catch (Exception e){

        }
    }
}

