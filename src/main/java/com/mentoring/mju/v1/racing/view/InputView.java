package com.mentoring.mju.v1.racing.view;


import java.util.Scanner;

public class InputView {
    static final Scanner input = new Scanner(System.in);
    public int getChance() {
        System.out.println("시도할 회수는?");
        return input.nextInt();
    }
    public String getMoveCarName() {
        System.out.println("자동차 이름 입력");
        return input.next();
    }
// Todo : 입력 받기
}
