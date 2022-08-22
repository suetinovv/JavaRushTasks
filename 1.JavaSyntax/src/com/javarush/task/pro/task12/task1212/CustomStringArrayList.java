package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        int x = capacity;
        String[] copyElements = new String[x];
        System.arraycopy(elements, 0,copyElements,0, x);
        capacity += capacity / 2;
        elements = new String[capacity];
        System.arraycopy(copyElements, 0,elements,0, x);
    }

}
