import Transport.Auto;

public class DriverB<B extends Auto> extends Driver {


    public DriverB(String name, int experience,String license) {
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

    public void agreement(String auto) {
        System.out.println("Водитель " + getName() + " с категорией прав "
                + getLicense() + " может учавствовать в гонке");
    }
}
