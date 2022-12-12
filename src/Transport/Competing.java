package Transport;

public interface Competing {

    int[] pitStop();

    int[] bestLapTime();

    int[] maxSpeed();

    void addDriver(Driver driver);
}
