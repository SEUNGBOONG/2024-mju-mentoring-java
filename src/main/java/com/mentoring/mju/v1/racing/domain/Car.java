package com.mentoring.mju.v1.racing.domain;


import com.mentoring.mju.v1.racing.view.InputView;

import java.util.Random;

public class Car {
    private static final int Move_Count = 0;
    private static final int Boundary_Move_count = 3;
    private static String carName;
    private int moveCount;

    private static InputView inputView;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = Move_Count;
        validateContainsNumber();
        move();
        randomNumber();
    }

    private static int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        return randomNumber;
    }

    public static String getCarName() {
        return carName;
    }


    public int getMoveCount() {
        return moveCount;
    }

    public static String validateContainsNumber() {
        for (char exceoptionName : inputView.getMoveCarName().toCharArray()) {
            if (Character.isDigit(exceoptionName)) {
                throw new IllegalArgumentException("숫자라서 예외");
            }
        }
        return carName;
    }

    public int move() {
        for (int i = 0; i < inputView.getChance(); i++) {
            if (randomNumber() > Boundary_Move_count) { //3보다 크면 움직인다.
                this.moveCount++;
            }
        }
        return moveCount;
    }
}
