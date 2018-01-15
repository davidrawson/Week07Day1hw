public class Waltzer extends Ride {

    private int capacity;

    public Waltzer(String name, int minAge, int minHeight, double price, int capacity){
        super(name, minAge, minHeight, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
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
//        if (money >= price){
//            return true;
//        }else{
//            return false;
//        }

//    }
}
