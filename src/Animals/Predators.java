package Animals;

public class Predators extends Mammals {
    private String typeOfFood;

    protected Predators(String name, int age, String livingEnvironment, int movingSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movingSpeed);
        this.typeOfFood = typeOfFood;
    }

    public void hunt() {
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
}
