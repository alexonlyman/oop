package Transport;

public class Freightcar extends Transport implements Competing{
    public enum loadCapacity {
        N1(0,3.5f),
        N2(3.5f,12),
        N3(12,0);

        private final float  min;
        private final float max;


        loadCapacity(float min, float max) {


            this.min = min;
            this.max = max;
        }

        public float getMin() {
            return min;
        }

        public float getMax() {
            return max;
        }

        public String toString() {
            return "Грузоподьемность N1" + N1
                    + "Грузопдьемность N2" + N2
                    + "Грузоподьемность N3" + N3;
        }
    }


    public static final int[] LAPS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private int[] time = new int[4];

    public Freightcar(String model, String brand, float engineVolume) {
        super(model, brand, engineVolume);
    }

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
