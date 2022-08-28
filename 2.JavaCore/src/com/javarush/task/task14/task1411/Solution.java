package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (str.equals("user") | str.equals("loser") | str.equals("coder") | str.equals("proger"))
        {
            if (str.equals("user")){
                person = new Person.User();
            } else if (str.equals("loser")){
                person = new Person.Loser();
            } else if (str.equals("coder")){
                person = new Person.Coder();
            } else if (str.equals("proger")){
                person = new Person.Proger();
            }

            doWork(person);
            str = scanner.nextLine();
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
