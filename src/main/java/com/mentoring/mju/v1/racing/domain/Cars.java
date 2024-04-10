package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String COMMA = ",";

    private List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars createCars(String carNames) {
        String[] split = carNames.split(COMMA);
        List<Car> carsList = new ArrayList<>();
        for (String name : split) {
            carsList.add(new Car(name));
        }
        return new Cars(carsList);
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
        return getCars(maxCount, winners);
    }

    private List<Car> getCars(int maxCount, List<Car> winners) {
        for (Car car : cars) {
            if (maxCount == car.getMoveCount()) {
                winners.add(car);
            }
        }
        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }
}
