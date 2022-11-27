package Animals;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }


    public void hunt() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
}
