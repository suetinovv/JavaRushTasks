package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(args[0]));
        FileOutputStream fw = new FileOutputStream(args[1]);
        byte[] buffer = new byte[1000];
        br.read(buffer);
        String s = new String(buffer, Charset.forName("Windows-1251"));
        fw.write(s.getBytes(StandardCharsets.UTF_8));
    }
}
