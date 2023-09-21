package com.eLibrary;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);

        Random random = new Random();

        int randomDelay = random.nextInt(17001) + 7000; // 17-24

        Thread.sleep(randomDelay);
        System.exit(0);
    }

}