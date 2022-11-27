package Animals;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель",10,
                "Леса",6-25,"трава, листья деревьев, ягоды");
        Herbivores giraffe = new Herbivores("Жираф",7,
                "Саванна",14-20,"трава, листья деревьев, ягоды");
        Herbivores horse = new Herbivores("Лошадь",3,
                "Поля,далины",10-20,"трава, листья деревьев, ягоды");
        gazelle.eat();
        gazelle.graze();
        gazelle.sleep();
        gazelle.move();
        gazelle.walk();

        Predators hyena = new Predators("Гиена", 15, "Пустыни,леса",
                10-30,"млекопитающие");
        Predators tigre = new Predators("Тигр", 10, "Саванна, леса, ",
                10-30,"млекопитающие");
        Predators bear = new Predators("Медведь", 7, "Леса,поля",
                10-30,"млекопитающие,рыба,ягоды");
        bear.hunt();
        bear.eat();
        bear.move();
        bear.sleep();

        Amphibians frog = new Amphibians("Лягушка", 2, "Водоемы, озера, реки");
        Amphibians snake = new Amphibians("Уж преснводный", 4, "Пресноводные озера и водоемы");
        snake.eat();
        snake.hunt();
        snake.move();

        Flightless peacock = new Flightless("Павлин", 10, "Поля,луга",
                "Полет, ходьба");
        Flightless penguin = new Flightless("Пингвин", 8, "Поля,луга",
                "Бег, ходьба");
        Flightless bird = new Flightless("Птица додо", 7, "Поля,луга",
                "Бег, ходьба");
        peacock.eat();
        peacock.walk();
        peacock.hunt();
        peacock.move();

        Flying gull = new Flying("Чайка", 2,
                "Озера,прибрежные районы, реки", "Полет");
        Flying albatross = new Flying("Альатрос", 3,
                "Озера,прибрежные районы, реки", "Полет");
        Flying falcon = new Flying("сокол", 2,
                "Равнины, далины, скалистая иестность", "Полет");
        gull.fly();
        gull.eat();
        gull.hunt();
        gull.move();
        gull.sleep();

    }
}
