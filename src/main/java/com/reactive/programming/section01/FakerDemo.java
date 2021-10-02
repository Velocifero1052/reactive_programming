package com.reactive.programming.section01;

import com.github.javafaker.Faker;
import com.reactive.programming.courseutil.Util;

public class FakerDemo {

    public static void main(String[] args) {
        Faker faker = Util.faker();
        for(int i = 0; i < 10; i++){
            System.out.println(faker.name().fullName());
        }
    }

}
