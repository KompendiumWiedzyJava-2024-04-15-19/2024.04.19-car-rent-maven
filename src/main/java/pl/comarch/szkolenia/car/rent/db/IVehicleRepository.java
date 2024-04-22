package pl.comarch.szkolenia.car.rent.db;

import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;

public interface IVehicleRepository {
    Collection<Vehicle> getVehicles();
    boolean rentVehicle(String plate);
    boolean returnVehicle(String plate);
}
