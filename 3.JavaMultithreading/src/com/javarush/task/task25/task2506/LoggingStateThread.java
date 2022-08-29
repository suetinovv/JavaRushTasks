package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{

    Thread thread;

    @Override
    public void run() {
        State s = thread.getState();
        System.out.println(s);
        while (true){
            if (!(s.equals(thread.getState()))){
                s = thread.getState();
                System.out.println(s);
                if (s == State.TERMINATED){
                    break;
                }
            }
        }
    }

    public LoggingStateThread(Thread thread){
        this.thread = thread;
    }
}
