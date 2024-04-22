package pl.comarch.szkolenia.car.rent.model;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String brand, String model,
                 String plate, double price,
                 int capacity) {
        super(brand, model, plate, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append(" ")
                .append(this.capacity)
                .toString();
    }
}
