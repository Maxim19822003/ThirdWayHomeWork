package org.example;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Иван", 100, 2),
                new Cat("Мурзик", 150, 1),
                new Robot("R2D2", 200, 3)
        };

        Obstacle[] obstacles = {
                new Treadmill(100),
                new Wall(2),
                new Treadmill(200),
                new Wall(3)
        };

        for (Participant participant : participants) {
            boolean canContinue = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle.distance > 0) {
                    participant.run(obstacle.distance);
                } else {
                    participant.jump(obstacle.height);
                }
                if (obstacle.distance > 0 && obstacle.distance > participant.runLimit ||
                        obstacle.height > 0 && obstacle.height > participant.jumpLimit) {
                    canContinue = false;
                    break;
                }
            }
            if (!canContinue) {
                System.out.println(participant.name + " выбывает из соревнования.");
                break;
            }
        }
    }
}
