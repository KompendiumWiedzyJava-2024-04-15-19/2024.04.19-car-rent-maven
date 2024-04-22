package pl.comarch.szkolenia.car.rent.db;

import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;

public class VehicleRepositoryV3 implements IVehicleRepository {
    @Override
    public Collection<Vehicle> getVehicles() {
        return null;
    }

    @Override
    public boolean rentVehicle(String plate) {
        return false;
    }

    @Override
    public boolean returnVehicle(String plate) {
        return false;
    }
}
