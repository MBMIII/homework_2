package streams;

import java.time.Duration;

//абстрактная часть трансляции
public abstract class AbstractStream implements Paidable {
    private Duration duration;

    public AbstractStream(int duration) {
        this.duration = Duration.ofMinutes(duration);
    }

    public abstract void play();

    public Long getDuration() {
        return duration.toMinutes();
    }

    public long earned() {
        return 0;
    }
}
