package streams;

public class NullStream extends AbstractStream{
    public NullStream(int duration) {
        super(duration);
    }

    @Override
    public void play() {
        System.out.println("Null stream, nothing to play");
    }
}