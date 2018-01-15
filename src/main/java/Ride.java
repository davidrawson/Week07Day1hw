public abstract class Ride implements IRide {

    protected String name;
    protected int minAge;
    protected int minHeight;
    protected double price;

    public Ride(String name, int minAge, int minHeight, double price) {
        this.name = name;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean checkOldEnough(int age) {
        if (age >= minAge) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTallEnough(int height) {
        if (height >= minHeight) {
            return true;
        } else {
            return false;
        }
    }

    public void pay(double money) {
        if (hasEnoughMoney(money)) {
            money -= price;
        }
    }

    public boolean hasEnoughMoney(double money) {
        if (money >= price) {
            return true;
        } else {
            return false;
        }


    }
}