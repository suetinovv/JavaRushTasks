package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иванов Иван", 4.0);
        grades.put("Иванов Cthutq", 4.3);
        grades.put("Fknrgv Иван", 4.7);
        grades.put("Ивwef sefн", 4.1);
        grades.put("Иwefafv ан", 4.0);
    }
}
