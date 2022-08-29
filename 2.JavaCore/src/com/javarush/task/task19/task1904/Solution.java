package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] str = fileScanner.nextLine().split(" ");
            String firstName = str[1];
            String middleName = str[2];
            String lastName = str[0];
            Date birthDate = new Date(Integer.parseInt(str[5]) - 1900, Integer.parseInt(str[4]) - 1, Integer.parseInt(str[3]));
            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
        fileScanner.close();
        }
    }
}
