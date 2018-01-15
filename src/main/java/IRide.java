public interface IRide {

    boolean checkOldEnough(int age);

    boolean checkTallEnough(int height);

    void pay(double money);

    boolean hasEnoughMoney(double money);

}
