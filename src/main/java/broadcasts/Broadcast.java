package broadcasts;

import streams.Paidable;
import streams.AbstractStream;

import java.time.Duration;
import java.util.ArrayDeque;
import java.util.Queue;

//трансляция
public class Broadcast implements Paidable {
    private Queue<AbstractStream> abstractStreamList;
    private Duration duration;
    private String broadcastName;

    public Broadcast(int duration, String broadcastName) {
        abstractStreamList = new ArrayDeque<>();
        this.duration = Duration.ofMinutes(duration);
        this.broadcastName = broadcastName;
    }

    public void createStream(AbstractStream abstractStream) {
        if (duration.toMinutes() <= 0) {
            duration = Duration.ofMinutes(0);
        }
        if (abstractStream.getDuration() > duration.toMinutes()) {
            System.out.println("Duration " + abstractStream.getDuration() + " too long. " + "Remain time left is " + duration.toMinutes());
            return;
        }
        abstractStreamList.add(abstractStream);
        duration = Duration.ofMinutes(duration.toMinutes() - abstractStream.getDuration());
        earned();
    }

    public long getRemainMinutesOfBroadcast() {
        return duration.toMinutes();
    }

    public Queue<AbstractStream> getStreams() {
        return abstractStreamList;
    }

    public Long getDuration() {
        return duration.toMinutes();
    }

    //адаптер
    @Override
    public long earned() {
        long temp = 0;
        for (AbstractStream abstractStream : abstractStreamList) {
            temp = temp + abstractStream.earned();
        }
        return temp;
    }

    @Override
    public String toString() {
        return "broadcast " + broadcastName;
    }
}
