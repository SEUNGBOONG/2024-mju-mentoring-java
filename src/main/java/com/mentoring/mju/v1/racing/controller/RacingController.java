package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    private InputView inputView;
    private OutputView outputView;
    private Cars cars;
    private Car car;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        startRacing();
        validateContainsNumber();
    }

    public void startRacing() {
        String carNames = inputView.getMoveCarName();
        int chance = inputView.getChance();
        List<Car> temp = new ArrayList<>();
        String[] split = carNames.split(",");
        for (String name : split) {
            temp.add(new Car(name));
        }
        Cars cars = new Cars(temp);
        for (int i = 0; i < chance; i++) {
            outputView.printResult(car);
        }
    }

    public String validateContainsNumber() {
        for (char exceoptionName : inputView.getMoveCarName().toCharArray()) {
            if (Character.isDigit(exceoptionName)) {
                throw new IllegalArgumentException("숫자라서 예외");
            }
        }
        return inputView.getMoveCarName(); //inputView에서 가져온데이터 예외처리
    }
    //자동차 이름을 받아서 숫자 예외처리 그리고 쉼표로 구분 하기
}
