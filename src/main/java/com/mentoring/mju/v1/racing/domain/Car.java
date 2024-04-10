package com.mentoring.mju.v1.racing.domain;

import java.util.Random;

public class Car {

    private final int BOUNDARY_MOVE_COUNT = 3;
    private final int INITIALIZATION_NUMBER = 0;
    private final int MAXIMUM_RANDOM_NUMBER = 10;

    private final String carName;
    private int moveCount;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = INITIALIZATION_NUMBER;
    }

    public void move() {

        Random random = new Random();
        if (random.nextInt(MAXIMUM_RANDOM_NUMBER) > BOUNDARY_MOVE_COUNT) {
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

