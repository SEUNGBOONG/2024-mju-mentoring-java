package com.mentoring.mju.v1.racing.domain;

import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class Cars {
    private final String comma = ",";
    private static List<Car> cars;

    public Cars(List<Car> cars) {
        racingWinner();
        carNameSplit();
        this.cars = cars;
    }

    public static String racingWinner() {
        List<Car> winner = new ArrayList<>();
        int maxCount = 0;
        for (Car car : Cars.cars) {
            maxCount = Math.max(maxCount, car.getMoveCount());
        }
        for (Car car : Cars.cars) {
            if (maxCount == car.getMoveCount()) {
                winner.add(car);
            }
        }
        return racingWinner();
    }

    public void carNameSplit() {
        String[] nameSplit = Car.getCarName().split(comma); //
        List<Car> cars = new ArrayList<>();
        for (String name : nameSplit) {
            Car car = new Car(name);
            cars.add(car);
        }
    }
}


