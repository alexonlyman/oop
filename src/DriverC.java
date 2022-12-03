import Transport.Freightcar;

public class DriverC<C extends Freightcar> extends Driver {
    public DriverC(String name, int experience,String license) {
        super(name, license, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель начинает движение");

    }

    @Override
    public void stopMove() {
        System.out.println("Водитель заканчивает движение");
    }

    @Override
    public void refuel() {
        System.out.println("нужно дозаправиться");
    }
}
