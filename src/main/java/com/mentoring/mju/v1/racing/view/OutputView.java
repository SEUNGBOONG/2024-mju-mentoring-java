package com.mentoring.mju.v1.racing.view;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;


public class OutputView {
    private Car car;
    // TODO : 화면 출력 구현

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
    public void printResult(Car car) {
        for (int i = 0; i < car.move(); i++) {
            System.out.println("-".repeat(car.move()));
        }
    }

}
