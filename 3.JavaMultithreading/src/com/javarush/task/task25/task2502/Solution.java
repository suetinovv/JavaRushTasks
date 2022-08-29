package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.List;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            wheels = new ArrayList<>();
            String[] str = loadWheelNamesFromDB();
            if (str.length == 4){
                for (String s : str) {
                    wheels.add(Wheel.valueOf(s));
                }
            } else {
                throw new Exception();
            }
        }

        protected String[] loadWheelNamesFromDB() {
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
