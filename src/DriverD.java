import Transport.Bus;

public class DriverD <D extends Bus> extends Driver {
    public DriverD(String name, int experience,String license) {
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
