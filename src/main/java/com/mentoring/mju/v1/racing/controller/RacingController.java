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

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startRacing() {
        List<Car> carsList = createCars();
        int chance = inputView.getChance();
        Cars cars = new Cars(carsList);
        for (int i = 0; i < chance; i++) {
            cars.moveAllCars();
            outputView.printResult(carsList);
        }
        List<Car> winners = cars.racingWinner();
        outputView.printWinners(winners);
    }

    private List<Car> createCars() {
        String carNames = inputView.getMoveCarName();
        String[] split = carNames.split(",");
        List<Car> carsList = new ArrayList<>();
        for (String name : split) {
            carsList.add(new Car(name));
        }
        return carsList;
    }
}
