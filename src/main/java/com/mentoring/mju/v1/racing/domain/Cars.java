package com.mentoring.mju.v1.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final String split = ",";
    private final List<Car> cars;


    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCars() {
        int randomNumber = 0;
        for (Car car : cars) {
            car.move(randomNumber);
        }
    }


    public void carNameSplit(String carName) {
        String[] nameSplit = carName.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : nameSplit) {
            Car car = new Car(name);
            cars.add(car);
        }


    }

    public List<Car> Winner() {
        int maxCount = 0;
        for (Car car : cars) {
            maxCount = Math.max(maxCount, car.getMoveCount());
        }
        List<Car> winner = new ArrayList<>();
        for (Car car : cars) {
            if (maxCount == car.getMoveCount()) {
                winner.add(car);
            }
        }
        return winner;
    }

    public List<Car> getCars() {
        return cars;
    }
    public String getSplit() {
        return split;
    }



}


