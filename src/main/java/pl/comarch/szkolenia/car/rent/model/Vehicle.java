package pl.comarch.szkolenia.car.rent.model;

public class Vehicle {
    private String brand;
    private String model;
    private boolean rent;
    private String plate;
    private double price;

    public Vehicle(String brand, String model,
                   String plate, double price) {
        this.brand = brand;
        this.model = model;
        this.rent = false;
        this.plate = plate;
        this.price = price;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getBrand())
                .append(" ")
                .append(this.getModel())
                .append(" ")
                .append(this.getPlate())
                .append(" ")
                .append(this.getPrice())
                .append(" ")
                .append(this.isRent() ?
                        "Niedostepny" : "Dostepny")
                .toString();
    }
}
