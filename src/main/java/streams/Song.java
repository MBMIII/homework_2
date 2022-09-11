package streams;

public class Song extends AbstractStream {
    private String singerName;
    private String songName;

    public Song(int duration, String singerName, String songName) {
        super(duration);
        this.singerName = singerName;
        this.songName = songName;
    }

    @Override
    public void play() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Song{" +
                "singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' + " duration= " + getDuration() +
                '}';
    }
}
