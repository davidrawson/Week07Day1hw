public class Waltzer extends Ride {

    private int capacity;

    public Waltzer(String name, int minAge, int minHeight, double price, int capacity){
        super(name, minAge, minHeight, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
