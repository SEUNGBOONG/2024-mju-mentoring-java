package com.mentoring.mju.v1.racing.view;

import com.mentoring.mju.v1.racing.domain.Car;
import com.mentoring.mju.v1.racing.domain.Cars;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static int chance;
    private String moveCarName;

    static final Scanner input = new Scanner(System.in);

    public InputView() {
        OutputView outputView = new OutputView();
        outputView.tryChance();
        chance = input.nextInt();
        outputView.moveCarName();
        moveCarName = input.next();
    }

    public static int getChance() {
        return chance;
    }

    public String getMoveCarName() {
        return moveCarName;
    }
// Todo : 입력 받기
}
