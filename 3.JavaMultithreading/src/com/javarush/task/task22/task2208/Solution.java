package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder str = new StringBuilder("");
        if (params.size() > 0){
            for (Map.Entry x : params.entrySet()){
                if (x.getValue() != null){
                    str.append(x.getKey() + " = \'" + x.getValue() + "\' and ");
                }
            }
            if (str.length() > 5){
                str.delete(str.length() - 5, str.length());
            }
        }

        return str.toString();
    }
}
