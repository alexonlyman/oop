package Transport;

import java.util.regex.Pattern;

public class Driver {
    private String name;
    private String surname;
    private String license;
    private final String licenseValues = "ABCD";

    public Driver(String name, String surname, String license) {
        this.name = name;
        this.surname = surname;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLicense(String values) {
        if (license == null || license.isEmpty() || license.isBlank()) {
            System.out.println("лицензия отсутвует");
        } if (Pattern.matches("[ABCD]", values)) {
            return values;
        } else {
            System.out.println("категория прав некорректа");
        }

            return values;
    }

    public void setLicense(String license) {
        this.license = license;
    }

}
