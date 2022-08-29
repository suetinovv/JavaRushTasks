package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Nit1());
        threads.add(new Nit2());
        threads.add(new Nit3());
        threads.add(new Nit4());
        threads.add(new Nit5());
    }

    public static void main(String[] args) {
    }

    public static class Nit1 extends Thread{
        @Override
        public void run() {
            try {
                while (true){

                }
            } catch (Exception e){

            }
        }
    }
    public static class Nit2 extends Thread{
        public void run() {
            try {
                throw new InterruptedException("InterruptedException");
            } catch (InterruptedException interruptedException) {
                System.out.println("InterruptedException");
            }

        }
    }
    public static class Nit3 extends Thread{
        @Override
        public void run() {
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (Exception e){

            }
        }
    }
    public static class Nit4 extends Thread implements Message{
        boolean b = true;
        @Override
        public void run() {
            try {
                while (b){

                }
            } catch (Exception e){

            }
        }

        @Override
        public void showWarning() {
            b = false;
        }
    }
    public static class Nit5 extends Thread{
        public void run() {
            try {
                String str;
                int count = 0;
                while (!isInterrupted()){
                    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
                    str = buff.readLine();
                    try {
                        if (str.equals("N")){
                            System.out.println(count);
                            interrupted();
                            break;
                        } else {
                            count += Integer.parseInt(str);
                        }
                    } catch (Exception e){
                    }
                }
            } catch (Exception e){

            }
        }
    }
}