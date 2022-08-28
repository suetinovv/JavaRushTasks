package com.javarush.task.task13.task1319;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(scanner.nextLine()));
        String str;
        while (true){
            str = scanner.nextLine();
            bufferedWriter.write(str + '\n');
            if (str.equals("exit")){
                break;
            }
        }
        bufferedWriter.close();
    }
}
