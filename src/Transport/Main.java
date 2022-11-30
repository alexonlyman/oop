package Transport;

import static Transport.Auto.LAPS;

public class Main {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW", "Z1", 2.0f);
        Auto kia = new Auto("KIA", "Sportage", 2.5f);
        Auto volvo = new Auto("Volvo", "A=5", 2.0f);
        Auto lada = new Auto("Lada", "Kalina", 1.5f);
        Bus ford = new Bus("Ford", "Transit", 4.5f);
        Bus honda = new Bus("Honda", "Sportbus", 5.0f);
        Bus suzuki = new Bus("Suzuki", "Suzukisport", 6.0f);
        Bus nissan = new Bus("Nissan", "Q8", 5.5f);
        Freightcar man = new Freightcar("MAN", "TGL", 17);
        Freightcar zil = new Freightcar("Зил", "СААЗ-454510", 20);
        Freightcar hyundai = new Freightcar("Hyundai", "HD 170", 25);
        Freightcar iveco = new Freightcar("Iveco", "Trakker AD380T38WH", 30);

        int[] racing = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ford.pitStop();
}
}
