package com.javarush.task.task13.task1326;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream input = new FileInputStream(scanner.nextLine());
        Scanner scanner1 = new Scanner(input);
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner1.hasNext()){
            list.add(scanner1.nextInt());
        }
        list.stream()
                .filter(o -> o % 2 == 0)
                .sorted((o1, o2) -> o1 - o2)
                .forEach(System.out::println);
        input.close();
    }
}
