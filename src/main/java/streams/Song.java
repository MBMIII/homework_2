package streams;

public class Song extends AbstractStream {
    private String singerName;
    private String songName;

    private Song(int duration, String singerName, String songName) {
        super(duration);
        this.singerName = singerName;
        this.songName = songName;
    }

    public static Builder builder() {
        return new Builder();
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

    public static class Builder {
        private int duration;
        private String singerName;
        private String songName;

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder singerName(String singerName) {
            this.singerName = singerName;
            return this;
        }

        public Builder songName(String songName) {
            this.songName = songName;
            return this;
        }

        public Song build() {
            return new Song(duration, singerName, songName);
        }
    }
}
