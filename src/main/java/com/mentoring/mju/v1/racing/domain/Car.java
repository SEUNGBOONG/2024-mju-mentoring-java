package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.Random;


public class Car {
    private static final int Move_Count=0;
    private static final int Boundary_Move_count=3;


    private String carName;
    private int randomNumber;
    private int moveCount;

    public Car(String carName, int moveCount) {
        this.carName = carName;
        this.randomNumber = randomNumber;
        this.moveCount = Move_Count;
        extracted(carName);
    }

    //예외하기

    private static void extracted(String carName) {
        for(char exceoptionName: carName.toCharArray()){
            if(Character.isDigit(exceoptionName)){
                throw new IllegalArgumentException("숫자라서 예외");
            }
        }
    }

    public void move(int randomNumber){
        if(randomNumber>Boundary_Move_count){ //3보다 크면 움직인다.
            this.moveCount++;
        }
    }

}
