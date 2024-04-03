package com.mentoring.mju;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mentoring.mju.v1.racing.controller.RacingController;
import com.mentoring.mju.v1.racing.domain.Cars;
import com.mentoring.mju.v1.racing.view.InputView;
import com.mentoring.mju.v1.racing.view.OutputView;


public class Application {
    public static void main(String[] args) {
        RacingController racingController = new RacingController(
                new InputView(),
                new OutputView()
        );
        racingController.startRacing();
    }
}