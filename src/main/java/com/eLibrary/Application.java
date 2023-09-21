package com.eLibrary;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);

        Random random = new Random();

        Thread.sleep(random.nextInt(10001));
        Thread.sleep(random.nextInt(3001) + 7000);
        System.exit(0);
    }

}