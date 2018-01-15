public abstract class Ride {

    private String name;
    private int minAge;
    private int minHeight;
    private double price;

    public Ride(String name, int minAge, int minHeight, double price){
        this.name = name;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.price = price;

    }

    public String getName(){
        return this.name;
    }

    public int getMinAge(){
        return this.minAge;
    }

    public int getMinHeight(){
        return minHeight;
    }

    public double getPrice(){
        return this.price;
    }

}
