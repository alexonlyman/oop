import java.time.LocalDate;
import java.util.regex.Pattern;

public class Auto {
   private final String brand;
   private final String model;
   private float engineVolume;
   private String color;
   private final int year;
   private final String country;
   private String transmission;
   private final String bodyType;
   private int registrationNumber;
   private final int numberOfSeats;

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    private boolean isSummerRubber;

    Auto(String brand,
         String model,
         float engineVolume,
         String color,
         int year,
         String country, String bodyType, int registrationNumber, int numberOfSeats, boolean isSummerRubber) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.isSummerRubber = isSummerRubber;
        if (engineVolume == 0) {
            engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            color = "белый";
        } else {
            this.color = color;
        }
        this.year = year;
        this.country = country;

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
        return "Бренд " + this.brand
                + "Модель" + this.model
                + "Обьем двигателя " + this.engineVolume
                + " Цвет " + this.color
                + " Год выпуска " + this.year
                + " Страна производства " + this.country;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
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
        private LocalDate expireDate;
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
