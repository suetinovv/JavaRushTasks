package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses = new ArrayList<>();

    public Hippodrome(List horses){
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> newHorses = new ArrayList<>();
        newHorses.add(new Horse("name1", 3, 0));
        newHorses.add(new Horse("name2", 3, 0));
        newHorses.add(new Horse("name3", 3, 0));
        game = new Hippodrome(newHorses);
        game.run();
        game.printWinner();

    }

    public Horse getWinner(){
        Horse winHorse = null;
        double maxDist = 0;
        for (Horse h : horses){
            if (h.getDistance() > maxDist){
                winHorse = h;
            }
        }
       return winHorse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse h : getHorses()){
            h.move();
        }
    }

    public void print(){
        for (Horse h : getHorses()){
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
