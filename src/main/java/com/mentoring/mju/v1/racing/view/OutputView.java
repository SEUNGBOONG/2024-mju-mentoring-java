package com.mentoring.mju.v1.racing.view;

import com.mentoring.mju.v1.racing.domain.Car;

import java.util.List;

public class OutputView {
    public void printResult(List<Car> cars) {
        for (Car car : cars) {
            StringBuilder result = new StringBuilder();
            result.append(car.getCarName()).append(": ");
            for (int i = 0; i < car.getMoveCount(); i++) {
                result.append("-");
            }
            System.out.println(result);
        }
    }

    public void printWinners(List<Car> winners) {
        System.out.println("Winner : ");
        for (Car winner : winners) {
            System.out.println(winner.getCarName());
        }
    }
}
