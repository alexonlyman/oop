
public class Flowers {
    private String flowerColor;
    private String name;
    private String country;
    private float cost;
    public int lifeSpan;

    Flowers (String name,String flowerColor, String country, float cost, int lifeSpan) {

        this.name = name;
        if (flowerColor == null) {
            this.flowerColor = " Белый ";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = " Россия ";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = Math.abs(3);
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = " Белый ";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = " Россия ";
        } else {
            this.country = country;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public String toString() {
        return "Цвет " + flowerColor
                + " Страна " + country
                + String.format("%.2f",cost)
                + " Время цветения " + lifeSpan;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


