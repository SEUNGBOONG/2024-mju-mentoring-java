package com.mentoring.mju.v1.racing.domain;

import java.util.Random;

public class Car {
    private String carName;
    private int number;
    private final int BoundaryNumber = 10;
    private int moveCount;
    public Car(String carName) {
        this.carName = carName;
    }

    public void Moving(int moveCount){
        this.moveCount=getMoveCount();
    }
    public void Random(int number){
        this.number=getNumber();
    }

    public String getCarName() {
        carName.split(",");
        return carName;
    }

    public int getNumber() {
        //랜덤 숫자 데이터 받기
        Random random = new Random();
        random.nextInt(BoundaryNumber);
        return number;
    }

    public int getMoveCount() {
        // 숫자가 만약 4이상이면 moveCount++
        if (getNumber() >= 4) {
            moveCount++;
        }
        return moveCount;
    }
}
