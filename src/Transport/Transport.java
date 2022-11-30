package Transport;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;

//    private final int year;
//    private final String country;
//    private String color;
//    private int maximumSpeed;

    protected Transport(String brand, String model, float engineVolume) {
//        this.year = year;
//        this.country = country;
        this.brand = brand;
        this.model = model;
//        this.color = color;
//        this.maximumSpeed = maximumSpeed;
//    }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

//        public abstract String refill ();
//
//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        this.color = Objects.requireNonNullElse(color, " белый ");
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getMaximumSpeed() {
//        if (maximumSpeed == 0) {
//            this.maximumSpeed = 150;
//        }
//        return maximumSpeed;
//    }
//
//    public void setMaximumSpeed(int maximumSpeed) {
//        this.maximumSpeed = maximumSpeed;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
    }

    public abstract void startMove();

    public abstract void stopMove();

        public String getBrand () {
            this.brand = Objects.requireNonNullElse(brand, " не указано ");
            return brand;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        public String toString () {
            return "Бренд " + this.brand
                    + "Модель" + this.model
                    + "Обьем двигателя" + engineVolume;
        }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

}


