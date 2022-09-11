package broadcasts;

import java.time.Duration;

public class Broadcast {
    Duration duration;

    public Broadcast(Duration duration) {
        this.duration = duration;
    }

    public Long getDuration(){
        return duration.toMinutes();
    }
}
