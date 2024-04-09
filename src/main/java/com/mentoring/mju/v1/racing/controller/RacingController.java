package com.mentoring.mju.v1.racing.controller;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.List;

public class RacingController {

    // 상수
    private static final int NUM = 1;

    // 컴포넌트 (안변하면 final)
    private final InputView inputView;
    private final OutputView outputView;

    // 객체 or 필드
    private Cars cars;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startRacing() {
        String carNames = InputView.getMoveCarName();
        int chance = inputView.getChance();
        Cars cars = Cars.createCars(carNames);
        MoveCarName(chance, cars);
        List<Car> winners = cars.racingWinner();
        outputView.printWinners(winners);
    }

    private void MoveCarName(int chance, Cars cars) {
        for (int i = 0; i < chance; i++) {
            cars.moveAllCars();
            outputView.printResult(cars.getCars());
        }
    }
}
