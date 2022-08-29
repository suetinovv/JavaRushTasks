package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while (br.ready()){
            String[] str = br.readLine().split(" ");
            String name = str[0];
            if (str.length > 4){
                for (int i = 1; i < str.length - 3; i++) {
                    name = name + " " + str[i];
                }
            }
            int y = Integer.parseInt(str[str.length - 1]) - 1900;
            int m = Integer.parseInt(str[str.length - 2]) - 1;
            int d = Integer.parseInt(str[str.length - 3]);
            Date date = new Date(y,m,d);
            PEOPLE.add(new Person(name, date));
        }
        br.close();
    }
}
