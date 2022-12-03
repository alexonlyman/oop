public abstract class  Driver {
    private String name;
    private String license;
    private int experience;

    public Driver(String name, String license, int experience) {
        this.name = name;
        this.license = license;

        this.experience = experience;
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refuel();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
