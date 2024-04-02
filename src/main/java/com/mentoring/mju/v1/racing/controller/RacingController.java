package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;
import static com.mentoring.mju.v1.racing.domain.Car.validateContainsNumber;
import static com.mentoring.mju.v1.racing.domain.Cars.racingWinner;
import static com.mentoring.mju.v1.racing.view.OutputView.moveCarName;
import static com.mentoring.mju.v1.racing.view.OutputView.tryChance;

public class RacingController {
    private InputView inputView;
    private OutputView outputView;
    private Cars cars;
    private Car car;


    public RacingController() {
       startRacing();
    }
    public void startRacing(){
        tryChance();
        InputView.getChance();
        car.move();
        moveResult();
        moveCarName();
        cars.carNameSplit();
        validateContainsNumber();
        racingWinner();

    }

    private String moveResult() {
        StringBuilder moveResult = new StringBuilder();
        for (int i = 0; i < car.move(); i++) {
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
