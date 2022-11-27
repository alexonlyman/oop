package Animals;

public class Herbivores extends Mammals {
    private String typeOfFood;

    protected Herbivores(String name, int age, String livingEnvironment, int movingSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movingSpeed);
        this.typeOfFood = typeOfFood;
    }

    public void walk() {
    }


    public void graze() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
}
