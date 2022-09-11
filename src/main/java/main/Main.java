package main;

import broadcasts.Broadcast;
import radiostation.AustrianRadioStation;
import radiostation.RadioStation;
import streams.Advertising;
import streams.Interview;
import streams.Song;

public class Main {
    public static void main(String[] args) {
        RadioStation radioStation = AustrianRadioStation.getAustrianRadioStation();

        Broadcast morning = new Broadcast(30, "Morning");
        Broadcast afternoon = new Broadcast(50, "Afternoon");
        Broadcast evening = new Broadcast(60, "Evening");

        morning.createStream(new Song(3, "Eminem", "The way I am"));
        morning.createStream(new Advertising(3, "Loreal"));
        morning.createStream(new Song(3, "Eminem", "Cleaning of my closet"));

        afternoon.createStream(new Song(5, "Pink", "So What"));
        afternoon.createStream(new Interview(11, "Steven King"));

        evening.createStream(new Song(4, "Pink", "Funhouse"));

        radioStation.addBroadcast(morning).addBroadcast(afternoon).addBroadcast(evening);
        radioStation.play();

        System.out.println("Earned money: " + radioStation.earnedFromBroadcast());

    }
}
