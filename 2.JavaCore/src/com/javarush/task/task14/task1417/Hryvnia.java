package com.javarush.task.task14.task1417;

public class Hryvnia extends Money{
    public String getCurrencyName(){
        return "UAH";
    }
    public Hryvnia (double amount) {
        super(amount);
    }
}
