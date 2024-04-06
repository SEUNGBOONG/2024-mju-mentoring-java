package com.mentoring.mju.v1.racing.domain;

import com.mentoring.mju.v1.racing.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;
    private String Comma = ",";

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveAllCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> racingWinner() {
        List<Car> winners = new ArrayList<>();
        int maxCount = 0;
        for (Car car : cars) {
            maxCount = Math.max(maxCount, car.getMoveCount());
        }
        for (Car car : cars) {
            if (maxCount == car.getMoveCount()) {
                winners.add(car);
            }
        }
        return winners;
    }

    public List<Car> createCars() {
        String carNames = InputView.getMoveCarName();
        String[] split = carNames.split(Comma);
        List<Car> carsList = new ArrayList<>();
        for (String name : split) {
            carsList.add(new Car(name));
        }
        return carsList;
    }
}
