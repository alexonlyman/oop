import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        Person maksim = new Person(-3, null, "Минск",
                "бренд-менеджером ");
        Person anya = new Person(1993, " Аня ", "Москва",
                "методист образовательных программ");
        Person katya = new Person(1992, " Катя ", "Калиниград",
                "продакт-менеджер");
        Person artem = new Person(1995, " Артем ", "Москва",
                "директор по развитию бизнеса");
        maksim.setYearOfBirth(-32);
        maksim.setTown(null);
        System.out.println(maksim);


        System.out.println();
        System.out.println(" задание 3 ");

        Auto granta = new Auto("Lada ", " Granta ",
                1.7f, " желтый ", 2015, " Россия ", bodyType, registrationNumber, numberOfSeats, isSummerRubber);
        Auto audi = new Auto("Audi ", " A8 50L TDI quattro ",
                3.0f, " черный ", 2020, " Германия ", bodyType, registrationNumber, numberOfSeats, isSummerRubber);
        Auto bmw = new Auto(" BMW ", "Z8",
                3.0f, "черный", 2021, "Германия", bodyType, registrationNumber, numberOfSeats, isSummerRubber);
        Auto kia = new Auto(" KIA ", " SPORTAGE 4-го поколения ",
                2.4f, " красный ", 2018, " Южная Корея ", bodyType, registrationNumber, numberOfSeats, isSummerRubber);
        Auto hyundai = new Auto(" Hyundai ", " Avante ",
                1.6f, " оранжевый ", 2016, "Южная Корея", bodyType, registrationNumber, numberOfSeats, isSummerRubber);
        System.out.println(granta);

        System.out.println();
        System.out.println(" задание 4 ");

        Flowers[] flowers = new Flowers[4];
        flowers[0] = new Flowers("роза", null, "Golandia", 35.59f, 0);
        flowers[1] = new Flowers("хризантема", null, null, 15f, 5);
        flowers[2] = new Flowers("пион", null, "Angliya", 69.9f, 1);
        flowers[3] = new Flowers("гипсофила", null, "Turciya", 19.5f, 10);
        bouquet.costBouquet(flowers);
        System.out.println();

        String flower = choseFlower(flowers);
//        int total = totalFlowers ();




    }



    public static String choseFlower(Flowers[ ] flowers) {
        System.out.println("Выберите цветок");
      Scanner sc = new Scanner(System.in);
      String flower = sc.nextLine();
        if (flower.equals(flowers[0].getName())) {
            System.out.println("вы выбрали нужный цветок");
        } else {
            System.out.println("вы выбрали несуществующий цветок");
        }
        return flower;
    }

    public static int totalFlowers() {

        int total;
        int sum;
        int sum2;
        System.out.println("выберите количество");
        do {
            total = scanner.nextInt();
            System.out.println("Вы выбрали неподходящее количество, цветов должно быть минимум 5");
        } while (total < 5);
        System.out.println("вы выбрали нужное количество");
        System.out.println(total);
        return total;
    }



    }