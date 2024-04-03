package com.mentoring.mju.v1.racing.domain;

import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class Cars {
    private static List<Car> cars;
    private InputView inputView;

    public Cars(List<Car> cars) {
        racingWinner();
        this.cars = cars;
    }


    //우승자 구현
    public String racingWinner() {
        List<Car> winner = new ArrayList<>();
        int maxCount = 0;
        for (Car car : Cars.cars) {
            maxCount = Math.max(maxCount, car.move());
        }
        for (Car car : Cars.cars) {
            if (maxCount == car.move()) {
                winner.add(car);
            }
        }
        return racingWinner();
    }


}


