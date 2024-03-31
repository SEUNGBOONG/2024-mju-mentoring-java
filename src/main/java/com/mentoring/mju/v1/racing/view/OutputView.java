package com.mentoring.mju.v1.racing.view;

import static com.mentoring.mju.v1.racing.view.InputView.input;

public class OutputView {

    // TODO : 화면 출력 구현

    private static int Chance;
    private  static String carName;



    public OutputView() {
        moveCarName();
        tryChance();

    }

    private static void tryChance() {
        System.out.println("시도할 횟수는 몇회인가요?");
        int Chance = input.nextInt();
    }

    private static void moveCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름을 쉼표로 구분)");
        String moveCarName = input.next();
    }

    public static int getChance() {
        return Chance;
    }
    public static String getCarName() {
        return carName;
    }

}
