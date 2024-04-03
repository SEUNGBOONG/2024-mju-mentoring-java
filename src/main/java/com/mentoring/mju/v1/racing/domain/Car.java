package com.mentoring.mju.v1.racing.domain;


import com.mentoring.mju.v1.racing.view.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private static final int MOVE_COUNT = 0;
    private static final int BOUNDARY_MOVE_COUNT = 3;
    private String carName;
    private int moveCount;
    private InputView inputView;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = MOVE_COUNT;
        randomNumber();
        move();
    }
    //랜덤 넘버를 뽑아서 move 작동까지 완료
    private int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        return randomNumber;
    }
    public int move() {
        for (int i = 0; i < inputView.getChance(); i++) {
            if (randomNumber() > BOUNDARY_MOVE_COUNT) { //3보다 크면 움직인다.
                this.moveCount++;
            }
        }
        return moveCount;
    }
}
