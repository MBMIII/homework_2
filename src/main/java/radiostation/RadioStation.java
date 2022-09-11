package radiostation;

import broadcasts.Broadcast;
import streams.AbstractStream;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class RadioStation {

    protected Deque<Broadcast> broadcasts;

    private Map<Broadcast, Long> earned = new LinkedHashMap<>();

    protected RadioStation() {
        broadcasts = new ArrayDeque<>();
    }

    public abstract void play();

    public Map<Broadcast, Long> earnedFromBroadcast() {
        for (Broadcast broadcast : broadcasts) {
            earned.put(broadcast, broadcast.earned());
        }
        return earned;
    }

    public AbstractStream getCurrentStream(Broadcast broadcast) {
        return broadcast.getStreams().peek();
    }

    public RadioStation addBroadcast(Broadcast broadcast) {
        broadcasts.add(broadcast);
        return this;
    }
}