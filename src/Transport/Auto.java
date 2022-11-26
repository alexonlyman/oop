package Transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Auto extends Transport {
   private float engineVolume;
   private String color;
   private String transmission;
   private  String bodyType;
   private String registrationNumber;
   private  int numberOfSeats;
   public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    private boolean isSummerRubber;

    public Auto(String brand, String model, int year, String country, String color, int maximumSpeed,
                float engineVolume, String bodyType, String registrationNumber,
                int numberOfSeats, boolean isSummerRubber, String transmission) {
        super(year, country,brand,model,color,maximumSpeed);
        this.numberOfSeats = numberOfSeats;


        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (transmission == null) {
            this.transmission = "механическая";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null ) {
            this.registrationNumber = " не указан ";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 4;
        }
        this.isSummerRubber = isSummerRubber;
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }



    }

    public void switchRubber() {
    setSummerRubber(!this.isSummerRubber);
    }

    public String validateCarNumber(String numbers) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я][0-9]{3}", numbers)) {
            return numbers;
        } else {
            System.out.println("номер некорректный");
        } return "номер некорректный";
    }

    public String toString() {
        return
                "Обьем двигателя " + this.engineVolume
                + " Цвет " + this.color;


    }
    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String refill() {
        return "Бензин,Дизель или заряжать на электропарковках";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public static class Key {

        private final boolean remoteRunEngine;
        private final boolean noKeyAcces;

        public Key(boolean remoteRunEngine, boolean noKeyAcces) {
            this.remoteRunEngine = remoteRunEngine;
            this.noKeyAcces = noKeyAcces;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isNoKeyAcces() {
            return noKeyAcces;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private double cost;
        private String number;


        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }

        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpreDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("оформлять новую страховку");
            }

        }
        public void checkNumbers() {
            if (number.length() != 9) {
                System.out.println("некорректный воод");
            }
        }

    }
}
