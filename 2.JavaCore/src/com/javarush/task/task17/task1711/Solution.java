package com.javarush.task.task17.task1711;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Locale.ENGLISH;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], new Date(args[i + 2].substring(3, 6).concat(args[i + 2].substring(0, 3)).concat(args[i + 2].substring(5)))));
                        } else if (args[i + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], new Date(args[i + 2].substring(3, 6).concat(args[i + 2].substring(0, 3)).concat(args[i + 2].substring(5)))));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;

            case "-u": {
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i += 4) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        if (args[i + 2].equals("м")) {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        } else if (args[i + 2].equals("ж")) {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(new Date(args[i + 3].substring(3, 6).concat(args[i + 3].substring(0, 3)).concat(args[i + 3].substring(5))));
                    }
                }
                break;
            }

            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                }
                break;
            }

            case "-i": {
                SimpleDateFormat formated = new SimpleDateFormat("dd-MMM-yyyy", ENGLISH);
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " м " + formated.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        } else if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.FEMALE)) {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " ж " + formated.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        }
                    }
                }
                break;
            }
        }
    }
}
