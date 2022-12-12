package Transport;

public class Auto extends Transport implements Competing {
    public enum typeOfBody {SEDAN,HATCHBACK,COUPE,STATION_WAGON,SUV,CROSSOVER,PICKUP,VAN,MINIVAN}
    public static final String SEDAN = "седан";
    public static final String HATCHBACK = "хатчбэк";
    public static final String COUPE = "купе";
    public static final String STATION_WAGON = "универсал";
    public static final String SUV = "внедорожник";
    public static final String CROSSOVER = "кроссовер";
    public static final String PICKUP = "пикап";
    public static final String VAN = "фургон";
    public static final String MINIVAN = "минивен";

    public Auto(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);

    }

    public String toString() {
        return "седан" + SEDAN
                + "хатчбэк" + HATCHBACK
                + "купе" + COUPE
                + "универсал" + STATION_WAGON
                + "внедорожник" + SUV
                + "кроссовер" + CROSSOVER
                + "пикап" + PICKUP
                + "фургон" + VAN
                + "минивен" + MINIVAN;
    }

    @Override
    public boolean service() {

        return false;
    }

    @Override
    public void repair() {
        System.out.println("машина починена");
    }

    public static final int[] LAPS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final int[] time = new int[4];
    private final int[] speed = new int[4];



    @Override
    public void startMove() {
        System.out.println("начало движения");

    }

    @Override
    public void getDiagnosed() {

    }



    @Override
    public void stopMove() {
        System.out.println("конец движения");
    }

    @Override
    public int[] pitStop() {
        for (int i : LAPS) {
            if (i % 3 != 0) {
                System.out.println("Пора сделать Пит-Стоп");
            } else {
                System.out.println("Для Пит-Стопа рановато");
            }
        }

        return LAPS;
    }

    @Override
    public int[] bestLapTime() {
        int minTime = time[0];
        for (int i : time) {
            if (i > minTime) {
                minTime = i;
            }
            System.out.println("минимальное время круга" + minTime);
        }
        return time;
    }

    @Override
    public int[] maxSpeed() {
        int maxSpeed = speed[0];
        for (int i : speed) {
            if (i > maxSpeed) {
                maxSpeed = i;
            }
            System.out.println("минимальная скорость круга" + maxSpeed);
        }
        return speed;
    }

    @Override
    public void addDriver(Driver driver) {

    }
//   private String color;
//   private String transmission;
//   private  String bodyType;
//   private String registrationNumber;
//   private  int numberOfSeats;
//   public boolean isSummerRubber() {
//        return isSummerRubber;
//    }
//
//    public void setSummerRubber(boolean summerRubber) {
//        isSummerRubber = summerRubber;
//    }
//
//    private boolean isSummerRubber;
//
//    public Auto(String brand, String model, int year, String country, String color, int maximumSpeed,
//                float engineVolume, String bodyType, String registrationNumber,
//                int numberOfSeats, boolean isSummerRubber, String transmission) {
//        super(country,brand, engineVolume);
//        this.numberOfSeats = numberOfSeats;
//
//
//        if (bodyType == null) {
//            this.bodyType = "седан";
//        } else {
//            this.bodyType = bodyType;
//        }
//        if (transmission == null) {
//            this.transmission = "механическая";
//        } else {
//            this.transmission = transmission;
//        }
//        if (registrationNumber == null ) {
//            this.registrationNumber = " не указан ";
//        } else {
//            this.registrationNumber = registrationNumber;
//        }
//        if (numberOfSeats == 0) {
//            this.numberOfSeats = 4;
//        }
//        this.isSummerRubber = isSummerRubber;
//
//
//
//
//    }

//    public void switchRubber() {
//    setSummerRubber(!this.isSummerRubber);
//    }

//    public String validateCarNumber(String numbers) {
//        if (Pattern.matches("[а-я][0-9]{3}[а-я][0-9]{3}", numbers)) {
//            return numbers;
//        } else {
//            System.out.println("номер некорректный");
//        } return "номер некорректный";
//    }

//    public String toString() {
//        return
//                "Обьем двигателя " + this.engineVolume
//                + " Цвет " + this.color;
//
//
//    }
//    public float getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(float engineVolume) {
//        this.engineVolume = engineVolume;
//    }

//    @Override
//    public String refill() {
//        return "Бензин,Дизель или заряжать на электропарковках";
//    }

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//    public static class Key {
//
//        private final boolean remoteRunEngine;
//        private final boolean noKeyAcces;
//
//        public Key(boolean remoteRunEngine, boolean noKeyAcces) {
//            this.remoteRunEngine = remoteRunEngine;
//            this.noKeyAcces = noKeyAcces;
//        }
//        public Key() {
//            this(false, false);
//        }
//
//        public boolean isRemoteRunEngine() {
//            return remoteRunEngine;
//        }
//
//        public boolean isNoKeyAcces() {
//            return noKeyAcces;
//        }
//    }
//
//    public static class Insurance {
//        private final LocalDate expireDate;
//        private double cost;
//        private String number;
//
//
//        public Insurance(LocalDate expireDate, double cost, String number) {
//            if (expireDate == null) {
//                this.expireDate = LocalDate.now().plusDays(365);
//            } else {
//                this.expireDate = expireDate;
//            }
//            this.cost = cost;
//            if (number == null) {
//                this.number = "123456789";
//            } else {
//                this.number = number;
//            }
//
//        }
//
//        public LocalDate getExpireDate() {
//            return expireDate;
//        }
//
//        public double getCost() {
//            return cost;
//        }
//
//        public String getNumber() {
//            return number;
//        }
//
//        public void checkExpreDate() {
//            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
//                System.out.println("оформлять новую страховку");
//            }
//
//        }
//        public void checkNumbers() {
//            if (number.length() != 9) {
//                System.out.println("некорректный воод");
//            }
//        }

    }
