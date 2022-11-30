public class Person {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    Person(int yearOfBirth, String name, String town, String jobTitle) {

        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Привет! Меня зовут "
                + this.name
                + " Я из города "
                + this.town + " Я родился "
                + this.yearOfBirth
                + " Я работаю на должности "
                + this.jobTitle;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = " «Информация не указана» ";
        } else {
            this.name = name;
        }

    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "«Информация не указана»";
        } else {
            this.town = town;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

