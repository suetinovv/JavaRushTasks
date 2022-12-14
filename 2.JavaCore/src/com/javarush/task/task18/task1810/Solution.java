package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                FileInputStream inputStream = new FileInputStream(buff.readLine());
                if (inputStream.available() < 1000){
                    inputStream.close();
                    buff.close();
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
