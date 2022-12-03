import Transport.Auto;

public class Main1 {
    public static void main(String[] args) {
        DriverB<Auto> autoDriverB = new DriverB<>("Валера", 6, "B");
        autoDriverB.refuel();
        autoDriverB.agreement("bmw");
        autoDriverB.startMove();


    }
}
