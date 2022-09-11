package main;

import broadcasts.Broadcast;
import factory.Factory;
import radiostation.AustrianRadioStation;
import radiostation.RadioStation;
import streams.Song;

public class Main {
    public static void main(String[] args) {
        //pattern Singleton используется для создания одного объектра радио
        RadioStation radioStation = AustrianRadioStation.getAustrianRadioStation();

        Broadcast morning = new Broadcast(30, "Morning");
        Broadcast afternoon = new Broadcast(50, "Afternoon");
        Broadcast evening = new Broadcast(60, "Evening");

        //pattern Builder для создания объектов песни
        morning.createStream(Song.builder().duration(3).singerName("Eminem").songName("The way I am").build());
        //pattern Factory Method для создания объектов интервью и рекламы
        morning.createStream(Factory.getStream(Factory.StreamType.ADVERTISING, 3, "Loreal"));
        morning.createStream(Song.builder().duration(3).singerName("Eminem").songName("Cleaning of my closet").build());

        afternoon.createStream(Song.builder().duration(5).singerName("Pink").songName("So What").build());
        afternoon.createStream(Factory.getStream(Factory.StreamType.INTERVIEW, 11, "Steven King"));

        evening.createStream(Song.builder().duration(4).singerName("Pink").songName("Funhouse").build());

        radioStation.addBroadcast(morning).addBroadcast(afternoon).addBroadcast(evening);
        radioStation.play();

        System.out.println("Earned money: " + radioStation.earnedFromBroadcast());

    }
}
