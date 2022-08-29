package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        while (buff.ready()){
            String fileName = buff.readLine();
            if (!fileName.equals("exit")){
                new ReadThread(fileName);
            } else {
                break;
            }
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        Integer max;
        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                byte[] b = new byte[256];
                while (inputStream.available() > 0){
                    int x = inputStream.read();
                    b[x]++;
                }
                int count = 0;
                for (int i = 0; i < b.length; i++) {
                    if (b[i] > count){
                        count = b[i];
                        max = i;
                    }
                }
                resultMap.put(fileName, max);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
