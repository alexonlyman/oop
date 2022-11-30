package Transport;

public class Freightcar extends Transport implements Competing{
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
