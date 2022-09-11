package radiostation;

import broadcasts.Broadcast;
import streams.AbstractStream;

public class AustrianRadioStation extends RadioStation {

    private static AustrianRadioStation radioStation;

    private AustrianRadioStation() {
    }

    //pattern Singleton
    public static RadioStation getAustrianRadioStation() {
        if (radioStation == null) radioStation = new AustrianRadioStation();
        return radioStation;
    }

    //pattern Adapter
    @Override
    public void play() {
        earnedFromBroadcast();
        if (broadcasts.isEmpty())
            System.out.println("Nothing to play");
        for (Broadcast broadcast : broadcasts) {
            System.out.println(broadcast.toString() + " is playing");
            broadcast.getStreams().forEach(AbstractStream::play);
            broadcasts.removeFirst();
            System.out.println(broadcast + " has been ended.");
        }
    }

}
