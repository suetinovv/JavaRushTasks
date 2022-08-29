package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Locale.ENGLISH;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args[0].equals("-c")){
            if (args[2].equals("м")){
                allPeople.add(Person.createMale(args[1],  new Date(args[3].substring(3,6).concat(args[3].substring(0,3)).concat(args[3].substring(5)))));
            } else if (args[2].equals("ж")){
                allPeople.add(Person.createFemale(args[1], new Date(args[3].substring(3,6).concat(args[3].substring(0,3)).concat(args[3].substring(5)))));
            }
            System.out.println(allPeople.size() - 1);
        } else if (args[0].equals("-r")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat formated = new SimpleDateFormat("dd-MMM-yyyy", ENGLISH);
            if (person.getSex().equals(Sex.MALE)){
                System.out.println(person.getName() + " м " + formated.format(person.getBirthDate()));
            } else if (person.getSex().equals(Sex.FEMALE)){
                System.out.println(person.getName() + " ж " + formated.format(person.getBirthDate()));
            }
        } else if (args[0].equals("-u")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            if (args[3].equals("м")){
                person.setSex(Sex.MALE);
            } else if (args[3].equals("ж")) {
                person.setSex(Sex.FEMALE);
            }
            person.setBirthDate(new Date(args[4].substring(3,6).concat(args[4].substring(0,3)).concat(args[4].substring(5))));
        } else if (args[0].equals("-d")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
}
