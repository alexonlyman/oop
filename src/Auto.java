public class Auto {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Auto(String brand,
         String model,
         float engineVolume,
         String color,
         int year,
         String country) {
        if (brand == null) {
            brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0 ) {
            engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            color = "белый";
        } else {
            this.color = color;
        }
        if (year == 0)
        this.year = year;
        this.country = country;

    }

    public String toString() {
        return "Бренд " + this.brand
                + "Модель" + this.model
                + "Обьем двигателя " + this.engineVolume
                + " Цвет " + this.color
                + " Год выпуска " + this.year
                + " Страна производства " + this.country;

    }

}
