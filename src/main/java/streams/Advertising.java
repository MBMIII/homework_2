package streams;

public class Advertising extends AbstractStream implements Paidable {

    private String productName;
    private final int minuteCost = 300;

    public Advertising(int duration, String productName) {
        super(duration);
        this.productName = productName;
    }

    @Override
    public long earned() {
        return getDuration() * minuteCost;
    }

    @Override
    public void play() {
        System.out.println("Time for advertising. You're really need to buy " + productName);
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "productName='" + productName + '\'' +
                ", minuteCost=" + minuteCost +
                '}';
    }
}
