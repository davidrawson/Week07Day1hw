public class Dodgem extends Ride {

    private int numberOfCars;

    public Dodgem(String name, int minAge, int minHeight, double price, int numberOfCars){
        super(name, minAge, minHeight, price);
        this.numberOfCars = numberOfCars;
    }

    public int getNumberOfCars(){
        return numberOfCars;
    }

//    public boolean checkOldEnough(int age) {
//        if (age >= minAge){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public boolean checkTallEnough(int height) {
//        if (height >= minHeight){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public void pay(double money) {
//        if (hasEnoughMoney(money)){
//            money -= price;
//        }
//    }
//
//    public boolean hasEnoughMoney(double money) {
//        if (money >= price) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
