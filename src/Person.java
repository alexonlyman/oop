public class Person {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Person(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null) {
            this.name = " !Информация не указана! ";
        } else {
            this.name = name;

        }
        if (town == null) {
            this.town = " !Информация не указана! ";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = " !Информация не указана! ";
        } else {
            this.jobTitle = jobTitle;
        }
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

}

