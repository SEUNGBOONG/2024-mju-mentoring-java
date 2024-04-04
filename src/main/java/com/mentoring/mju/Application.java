package com.mentoring.mju;

import com.mentoring.mju.v1.racing.controller.RacingController;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingController racingController = new RacingController(inputView, new OutputView());
        racingController.startRacing();
    }
}
