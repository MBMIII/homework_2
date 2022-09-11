package main;

import broadcasts.Song;
import radiostation.AustrianRadioStation;
import radiostation.RadioStation;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        RadioStation radioStation = AustrianRadioStation.getAustrianRadioStation();
        radioStation.createMainBroadcast(Duration.ofMinutes(100));
        radioStation.addBroadcast(new Song(Duration.ofMinutes(50), "Eminem", "Lose Yourself"));
        radioStation.addBroadcast(new Song(Duration.ofMinutes(10), "Eminem", "White America"));
        radioStation.addBroadcast(new Song(Duration.ofMinutes(30), "Oxxxymiron", "Я-Хейтер"));
        radioStation.addBroadcast(new Song(Duration.ofMinutes(20), "Oxxxymiron", "Восточный мордор"));
        radioStation.play();
        System.out.println(radioStation.getRemainMinutesOfBroadcast());
    }
}
