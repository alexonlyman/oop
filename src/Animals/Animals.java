package Animals;


import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public abstract void eat();


    public void sleep() {

    }

    public abstract void move();



    public Animals(String name, int age) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = " не указано ";
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null && this.name.isEmpty() && this.name.isBlank()) {
            this.name = " не указано ";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age <= 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return getAge() == animals.getAge() && Objects.equals(getName(), animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
