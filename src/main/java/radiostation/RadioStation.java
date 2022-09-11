package radiostation;

import broadcasts.Broadcast;
import hosts.Host;

import java.time.Duration;
import java.util.ArrayDeque;
import java.util.Queue;

public class RadioStation {
    Queue<Broadcast> broadcastList;
    Queue<Host> hostList;
    Duration mainDuration;

    public RadioStation() {
        broadcastList = new ArrayDeque<>();
        hostList = new ArrayDeque<>();
    }

    public void addBroadcast(Broadcast broadcast) {
        if(mainDuration.toMinutes() <= 0){
            mainDuration = Duration.ofMinutes(0);
            return;
        }
        if(broadcast.getDuration() > mainDuration.toMinutes()){
            System.out.println("Duration " + broadcast.getDuration() + " too long. " + "Remain time left is " + mainDuration.toMinutes() );
            return;
        }
        broadcastList.add(broadcast);
        mainDuration = Duration.ofMinutes(mainDuration.toMinutes() - broadcast.getDuration());
    }

    public Broadcast getCurrentBroadcast() {
//        mainDuration = Duration.ofMinutes(mainDuration.toMinutes() + broadcastList.peek().getDuration());
        return broadcastList.poll();
    }

    public void play() {
        broadcastList.forEach(System.out::println);
    }

    public Broadcast createMainBroadcast(Duration duration) {
        this.mainDuration = duration;
        return new Broadcast(duration);
    }

    public long getRemainMinutesOfBroadcast() {
        return mainDuration.toMinutes();
    }
}
