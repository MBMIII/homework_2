package radiostation;

public class AustrianRadioStation extends RadioStation {

    private static AustrianRadioStation radioStation;

    private AustrianRadioStation() {

    }

    public static RadioStation getAustrianRadioStation() {
        if (radioStation == null)
            radioStation = new AustrianRadioStation();
        return radioStation;
    }

}
