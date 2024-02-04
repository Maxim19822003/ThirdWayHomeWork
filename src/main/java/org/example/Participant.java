package org.example;

public class Participant {
    String name;
    int runLimit;
    int jumpLimit;

    public Participant(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        }
    }

    void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(name + " успешно перепрыгнул " + height + " метров.");
        } else {
            System.out.println(name + " не смог перепрыгнуть " + height + " метров.");
        }
    }
}


