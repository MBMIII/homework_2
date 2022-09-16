package factory;

import streams.AbstractStream;
import streams.Advertising;
import streams.Interview;
import streams.NullStream;

public class Factory {

    public enum StreamType {
        ADVERTISING, INTERVIEW
    }


    public static AbstractStream getStream(StreamType streamType, int duration, String name) {
        AbstractStream abstractStream = new NullStream(0);
        switch (streamType) {
            case INTERVIEW -> abstractStream = new Interview(duration, name);
            case ADVERTISING -> abstractStream = new Advertising(duration, name);
            default -> System.out.println("Incorrect type");
        }
        return abstractStream;
    }
}
