package Transport;

public class Train extends Transport {
    private int costTheTrip;
    private int travelTime;
    private String departureStation;
    private String EndingStation;
    private int numberOfWagons;

    public Train(int year, String country, String model, String brand, String color, int maximumSpeed,
                 int costTheTrip, int travelTime, String departureStation,
                 String endingStation, int numberOfWagons) {
        super(year,country,model,brand,color,maximumSpeed);
        this.costTheTrip = costTheTrip;
        if (travelTime == 0) {
            System.out.println("Время не указано");
        } else {
            this.travelTime = travelTime;
        }
        this.departureStation = departureStation;
        EndingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String refill() {
        return "Дизель";
    }

    public String toString() {
        return " год " + getYear()
                + " Страна производства " + getCountry()
                + " Модель " + getModel()
                + " Бренд " + getBrand()
                + " Цвет " + getColor()
                + " Максимальная скорость " + getMaximumSpeed()
                +  " Цена поездки " + getCostTheTrip()
                + " Время поездки " + getTravelTime()
                + " Начальная станция " + getDepartureStation()
                + " Конечная " + getEndingStation()
                + " Количество вагонов " + getNumberOfWagons()
                + "Топливо -" + refill();
    }

    public int getCostTheTrip() {
        return costTheTrip;
    }

    public void setCostTheTrip(int costTheTrip) {
        this.costTheTrip = costTheTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getEndingStation() {
        return EndingStation;
    }

    public void setEndingStation(String endingStation) {
        EndingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
}
