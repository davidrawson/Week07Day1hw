public class Dodgem extends Ride {

    private int numberOfCars;

    public Dodgem(String name, int minAge, int minHeight, double price, int numberOfCars){
        super(name, minAge, minHeight, price);
        this.numberOfCars = numberOfCars;
    }

    public int getNumberOfCars(){
        return numberOfCars;
    }

}
