package com.eLibrary;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);

        Random random = new Random();

        int randomDelay = random.nextInt(10001) + 7000; // 10-17

        Thread.sleep(randomDelay);
        System.exit(0);
    }

}