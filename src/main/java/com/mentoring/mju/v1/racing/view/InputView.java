package com.mentoring.mju.v1.racing.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getMoveCarName() {
        System.out.println("자동차 이름 입력 (쉼표로 구분하여 입력하세요): ");
        return scanner.nextLine();
    }

    public int getChance() {
        System.out.println("시도할 회수는? ");
        return Integer.parseInt(scanner.nextLine());
    }
}
