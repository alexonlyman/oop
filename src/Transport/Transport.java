package Transport;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maximumSpeed;

    public Transport(int year, String country, String model, String brand, String color, int maximumSpeed) {
        this.year = year;
        this.country = country;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
    }

    public abstract String refill();

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        this.color = Objects.requireNonNullElse(color, " белый ");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumSpeed() {
        if (maximumSpeed == 0) {
            this.maximumSpeed = 150;
        }
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        this.brand = Objects.requireNonNullElse(brand, " не указано ");
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Бренд " + this.brand
                + "Модель" + this.model;
    }
}
