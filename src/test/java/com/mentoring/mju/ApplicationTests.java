package com.mentoring.mju;

import com.mentoring.mju.v1.racing.controller.RacingController;
import com.mentoring.mju.v1.racing.domain.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        RacingController racingController =new RacingController();
        racingController.startRacing();

    }

}
