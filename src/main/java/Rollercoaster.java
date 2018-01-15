

public class Rollercoaster extends Ride {

    private int maxHeight;

    public Rollercoaster(String name, int minAge, int minHeight, double price, int maxHeight){
        super(name, minAge, minHeight, price);
        this.maxHeight = maxHeight;
    }


    public int getMaxHeight() {
        return maxHeight;
    }

}
