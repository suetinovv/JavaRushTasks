package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(4.12, "ghbdtn");
        labels.put(6.12, "ghsdf");
        labels.put(7.12, "ghbsdfdtn");
        labels.put(8.12, "ghbdrsdftn");
        labels.put(43.12, "ghbsdfgdtn");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
