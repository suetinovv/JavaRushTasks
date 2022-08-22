package com.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try (InputStream input = url.openStream()){
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
            while (buffer.ready()){
                System.out.println(buffer.readLine());
            }
        }
    }
}