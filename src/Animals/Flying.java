package Animals;

public class Flying extends Birds {
    private String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public void fly() {
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
}
