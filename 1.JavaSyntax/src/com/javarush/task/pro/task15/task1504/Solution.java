package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            InputStream input = Files.newInputStream(Path.of(scanner.nextLine()));
            OutputStream output = Files.newOutputStream(Path.of(scanner.nextLine()));
            int x1;
            int x2;
            while (input.available() > 0) {
                x1 = input.read();
                if (input.available() > 0) {
                    x2 = input.read();
                    output.write(x2);
                    output.write(x1);
                }
                else {
                    output.write(x1);
                }
            }
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

