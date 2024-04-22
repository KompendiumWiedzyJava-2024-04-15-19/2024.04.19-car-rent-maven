package pl.comarch.szkolenia.car.rent.model;

public class Bus extends Vehicle {
    int seats;

    public Bus(String brand, String model,
               String plate, double price, int seats) {
        super(brand, model, plate, price);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append(" ")
                .append(this.seats)
                .toString();
    }
}
