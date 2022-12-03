package Transport;

public class Bus extends Transport implements Competing {
    public enum seatCapacity {
        ESPECIALLY_SMALL(0, 10),
        SMALL(0, 20),
        AVERAGE(40, 50),
        LARGE(60, 80),
        VERY_LARGE(100, 120);

        private Integer max;
        private Integer min;


        seatCapacity(Integer min, Integer max) {
            this.max = max;
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public String toString() {
            return "вместительность максимальная " + max
                    + "вместительность минимальная " + min;
        }
    }
    public static final int[] LAPS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private final int[] time = new int[4];


    public Bus(String model, String brand,float engineVolume) {
        super(model,brand, engineVolume);
    }

//    @Override
//    public String refill() {
//        return "Бензин или дизель";
//    }

    @Override
    public void startMove() {
        System.out.println("начало движения");
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
        return new int[0];
    }
}
