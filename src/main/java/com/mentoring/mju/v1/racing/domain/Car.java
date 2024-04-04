package com.mentoring.mju.v1.racing.domain;

import java.util.Random;

public class Car {
    private static final int BOUNDARY_MOVE_COUNT = 3;
    private String carName;
    private int moveCount;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = 0;
    }

    public void move() {
        Random random = new Random();
        if (random.nextInt(10) > BOUNDARY_MOVE_COUNT) {
            this.moveCount++;
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
