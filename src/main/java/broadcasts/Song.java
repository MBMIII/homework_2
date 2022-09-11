package broadcasts;

import java.time.Duration;

public class Song extends Broadcast {
    private String singerName;
    private String songName;

    public Song(Duration duration, String singerName, String songName) {
        super(duration);
        this.singerName = singerName;
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' + " duration= " + getDuration() +
                '}';
    }
}
