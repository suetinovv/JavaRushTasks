package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;
    private float distance;
    private int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach o) {
        if (this.quality - o.quality == 0){
            return (int) (o.distance - this.distance);
        } else if (o.distance - this.distance == 0){
            return this.quality - o.quality;
        } else if (this.quality - o.quality > 0){
            if (o.distance - this.distance < 0){
                return 0;
            } else if (o.distance - this.distance > 0){
                return this.quality - o.quality;
            }
        } else if (this.quality - o.quality < 0){
            if (o.distance - this.distance > 0){
                return 0;
            } else if (o.distance - this.distance < 0){
                return this.quality - o.quality;
            }
        }
        return 0;
    }
}
