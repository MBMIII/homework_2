package streams;

public class Interview extends AbstractStream implements Paidable {

    private String respondentName;
    private final int minuteCost = 30;

    public Interview(int duration, String respondentName) {
        super(duration);
        this.respondentName = respondentName;
    }

    @Override
    public void play() {
        System.out.println("We are doing interview with " + respondentName);
    }

    @Override
    public long earned() {
        return getDuration() * minuteCost;
    }
}
