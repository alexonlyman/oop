import Transport.Auto;
import Transport.Bus;
import Transport.Train;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
//        Person maksim = new Person(-3, null, "Минск",
//                "бренд-менеджером ");
//        Person anya = new Person(1993, " Аня ", "Москва",
//                "методист образовательных программ");
//        Person katya = new Person(1992, " Катя ", "Калиниград",
//                "продакт-менеджер");
//        Person artem = new Person(1995, " Артем ", "Москва",
//                "директор по развитию бизнеса");
//        maksim.setYearOfBirth(-32);
//        maksim.setTown(null);
//        System.out.println(maksim);


        System.out.println();
        System.out.println(" задание 3 ");

        Auto granta = new Auto("Lada ", " Granta ",
                2015, " Россия", "желтый", 120,1.4f, "седан",
                "",4, true,"механика");
        Auto audi = new Auto("Audi ", " A8 50L TDI quattro ",
                2020, " Германия ", " белынй", 220,3.0f,null,
                null,0, true,"");
        Auto bmw = new Auto(" BMW ", "Z8",
                2017, "Германия", "Белый ", 250,
                3.1f,"", null, 5,true,"автомат");
        Auto kia = new Auto(" KIA ", " SPORTAGE 4-го поколения ",
                2018, " Южная Корея ", "желтый", 210,  0,
                "", null, 5,true,null);
        Auto hyundai = new Auto(" Hyundai ", " Avante ",
                2016, " Южная Корея ", " красный", 0,
                2.0f,"", null, 4,true,"Механика");
        System.out.println(granta);

        System.out.println();
        System.out.println(" задание 4 ");

        Flowers[] flowers = new Flowers[4];
        flowers[0] = new Flowers("роза", null, "Golandia", 35.59f, 0);
        flowers[1] = new Flowers("хризантема", null, null, 15f, 5);
        flowers[2] = new Flowers("пион", null, "Angliya", 69.9f, 1);
        flowers[3] = new Flowers("гипсофила", null, "Turciya", 19.5f, 10);

//        System.out.println();
//
//         choseFlower(flowers);
//         totalFlowers();
//        System.out.println(costFlowers(flowers));
//        System.out.println();


        System.out.println("Trains");
        Train lastochka = new Train(2011," Россия "," B-901 ",null,null,301,
                3500,0," Белорусский вокзал ", " Минск-Пассажиркая ",
                11);
        Train leningrad = new Train(2019," Россия ","D-125",null,null,270,
                1700,0,"Ленинграский","Ленинград - Пассажирский",
                8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println();
        System.out.println("Автобус");
        Bus volvo = new Bus(2013,"Германия","X34","Volvo","Белый",200);
        Bus cadilac = new Bus(2014,"Германия","I5","Cadilac","Красный",200);
        Bus ford = new Bus(2015,"Германия","B15-1","Ford","Синий", 200);
    }

    public static String choseFlower(Flowers[] flowers) {
        System.out.println("Выберите цветок");
        Scanner sc = new Scanner(System.in);
        String flower = sc.nextLine();
        if (flower.equals(flowers[0].getName())
                || flower.equals(flowers[1].getName())
                || flower.equals(flowers[2].getName())
                || flower.equals(flowers[3].getName())) {
            return flower;
        } else {
            System.out.println("вы выбрали несуществующий цветок, пожалуйста выберите из списка - роза- пион - " +
                    " хразантема - гипсофила ");


            return sc.nextLine();
        }
    }

    public static int totalFlowers() {
        int total;
        System.out.println("выберите количество (минимум 5)");
        do {
            total = scanner.nextInt();
            if (total < 5) {
                int sum1 = 0;
                sum1 = 5 - total;
                System.out.println("вам осталось выбрать " + sum1 + " шт.");
            }
        } while (total < 5);
        System.out.println("вы выбрали нужное количество");
        return total;
    }

    public static float costFlowers(Flowers[] flowers) {
        float sum = 0f;
        if (choseFlower(flowers).equals(flowers[0].getName())) {
            sum = totalFlowers() * flowers[0].getCost();
        } else if (choseFlower(flowers).equals(flowers[1].getName())) {
            sum = totalFlowers() * flowers[1].getCost();
        } else if (choseFlower(flowers).equals(flowers[2].getName())) {
            sum = totalFlowers() * flowers[2].getCost();
        } else if (choseFlower(flowers).equals(flowers[3].getName())) {
            sum = totalFlowers() * flowers[3].getCost();
        }
        return sum;
    }


}