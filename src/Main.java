public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(-1988,null, "Минск",
                "бренд-менеджером ");
        Person anya = new Person(1993, " Аня ", "Москва",
                "методист образовательных программ");
        Person katya = new Person(1992, " Катя ", "Калиниград",
                "продакт-менеджер");
        Person artem = new Person(1995, " Артем ", "Москва",
                "директор по развитию бизнеса");
        System.out.println(maksim);
        System.out.println();
        System.out.println(" задание 3 ");

        Auto granta = new Auto("Lada ", " Granta ",
                1.7f, " желтый ", 2015, " Россия ");
        Auto audi = new Auto("Audi ", " A8 50L TDI quattro ",
                3.0f, " черный ", 2020, " Германия ");
        Auto bmw = new Auto(" BMW ", "Z8",
                3.0f, "черный", 2021, "Германия");
        Auto kia = new Auto(" KIA ", " SPORTAGE 4-го поколения ",
                2.4f, " красный ", 2018, " Южная Корея ");
        Auto hyundai = new Auto(" Hyundai ", " Avante ",
                1.6f, " оранжевый ", 2016, "Южная Корея");
        System.out.println(granta);
    }


}