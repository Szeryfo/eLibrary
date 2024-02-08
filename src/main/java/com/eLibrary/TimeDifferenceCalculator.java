package com.eLibrary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

public class TimeDifferenceCalculator {

    public static void main(String[] args) {
        calculator("start pobranie repo", "koniec pobranie repo");
        calculator("start Build", "koniec Build");
        calculator("start Testy", "koniec Testy");
        calculator("start Uruchomienie aplikacji", "koniec Uruchomienie aplikacji");
    }

    private static void calculator(String start, String end) {
        String filePath = "C:\\Users\\Kombi\\Documents\\eLibrary\\src\\main\\resources\\tekst.txt";

        LocalTime startTime = null;
        LocalTime endTime = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean foundStart = false;//

            while ((line = reader.readLine()) != null) {
                if (line.contains(start)) {
                    foundStart = true;
                    String[] parts = line.split(" ");
                    for (String part : parts) {
                        if (part.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}")) {
                            startTime = LocalTime.parse(part);
                            break; // Jeśli znaleziono czas początkowy, przerwij pętlę
                        }
                    }
                } else if (foundStart && line.contains(end)) {
                    String[] parts = line.split(" ");
                    for (String part : parts) {
                        if (part.matches("\\d{2}:\\d{2}:\\d{2}\\.\\d{3}")) {
                            endTime = LocalTime.parse(part);
                            break;//
                        }
                    }
                    break;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (startTime != null && endTime != null) {
            Duration duration = Duration.between(startTime, endTime);
            long hours = duration.toHours();
         //   long minutes = duration.toMinutesPart();
            long seconds = duration.toSecondsPart()+ duration.toMinutesPart() * 60L;
            long millis = duration.toMillisPart();

            System.out.println(start + ": " + startTime);
            System.out.println(end + ": " + endTime);
            System.out.println("Różnica czasu: " + hours + ":" + seconds + "." + millis);
            System.out.println(" ");
        } else {
            System.out.println("Nie udało się znaleźć czasów lub obu markerów w pliku.");
        }
    }
}
