package Transport;

public class Bus extends Transport {

    public Bus(int year, String country, String model, String brand, String color, int maximumSpeed) {
        super(year, country, model, brand, color, maximumSpeed);
    }

    @Override
    public String refill() {
        return "Бензин или дизель";
    }
}
