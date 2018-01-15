

public class Rollercoaster extends Ride {

    private int maxHeight;

    public Rollercoaster(String name, int minAge, int minHeight, double price, int maxHeight){
        super(name, minAge, minHeight, price);
        this.maxHeight = maxHeight;
    }


    public int getMaxHeight() {
        return maxHeight;
    }

//
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
