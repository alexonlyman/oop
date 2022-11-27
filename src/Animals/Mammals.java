package Animals;

public class Mammals extends Animals{
    private String livingEnvironment;
    private int movingSpeed;


    public Mammals(String name, int age, String livingEnvironment, int movingSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.movingSpeed = movingSpeed;
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

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed;
    }
}
