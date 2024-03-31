package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Cars cars;
    private final Car car;


    public RacingController(InputView inputView, OutputView outputView, Cars cars, Car car) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.cars = cars;
        this.car = car;
    }

    //조립
    public void Complete() {
        int chanceNumber = OutputView.getChance();
        String completeCarName = OutputView.getCarName();

    }

    public void MoveCar() {

        String replaced = moveResult(car.getRandomNumber());
    }

    private String moveResult(int randomNumber) {
        StringBuilder moveResult = new StringBuilder();
        for (int i = 0; i < randomNumber; i++) {
            char c = moveResult.charAt(i);
            if (Character.isDigit(c)) {
                moveResult.append("-");
            } else {
                moveResult.append(c);
            }
        }

        return moveResult.toString();
    }
}
