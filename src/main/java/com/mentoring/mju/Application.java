package com.mentoring.mju;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mentoring.mju.v1.racing.controller.RacingController;


public class Application {
    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        racingController.startRacing();
    }
}