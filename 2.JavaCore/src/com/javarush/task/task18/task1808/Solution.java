package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(buff.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(buff.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(buff.readLine());
        if (inputStream.available() % 2 == 0){
            byte[] bufer = new byte[inputStream.available() / 2];
            int count = inputStream.read(bufer);
            outputStream1.write(bufer, 0, count);
            count = inputStream.read(bufer);
            outputStream2.write(bufer, 0, count);
        } else {
            byte[] bufer = new byte[inputStream.available() / 2 + 1];
            int count = inputStream.read(bufer);
            outputStream1.write(bufer, 0, count);
            count = inputStream.read(bufer);
            outputStream2.write(bufer, 0, count);
        }
        outputStream1.close();
        outputStream2.close();
        inputStream.close();
        buff.close();
    }
}
