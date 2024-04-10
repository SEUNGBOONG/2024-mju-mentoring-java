package com.mentoring.mju.v1.racing.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("RandomNumberTest")
    void 무작위_숫자_테스트(){
        //given
        int random=2;
        String carName="povy,da,ee";
        //when
        Car car = new Car(carName);
        car.move();
        //then
        Assertions.assertThat(random).isEqualTo(2);
    }

}