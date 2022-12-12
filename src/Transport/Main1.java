package Transport;
public class Main1 {


    public static void main(String[] args) {
        Auto bmw = new Auto("BMW", "Z1", 2.0f);
        bmw.addDriver(new Driver("Bob","Bobov","C"));
        Auto kia = new Auto("KIA", "Sportage", 2.5f);
        Auto volvo = new Auto("Volvo", "A=5", 2.0f);
        Auto lada = new Auto("Lada", "Kalina", 1.5f);
        Bus ford = new Bus("Ford", "Transit", 4.5f);
        ford.addDriver(new Driver("Lola","Lfdd","C"));
        Bus honda = new Bus("Honda", "Sportbus", 5.0f);
        Bus suzuki = new Bus("Suzuki", "Suzukisport", 6.0f);
        Bus nissan = new Bus("Nissan", "Q8", 5.5f);
        nissan.addMechanic(new Mechanic("John","Johnov","Bubalex"));
        Freightcar man = new Freightcar("MAN", "TGL", 17);
        Freightcar zil = new Freightcar("Зил", "СААЗ-454510", 20);
        Freightcar hyundai = new Freightcar("Hyundai", "HD 170", 25);
        Freightcar iveco = new Freightcar("Iveco", "Trakker AD380T38WH", 30);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addAuto(kia);
        serviceStation.addTruck(zil);
        serviceStation.service();
        serviceStation.service();
    }

}
