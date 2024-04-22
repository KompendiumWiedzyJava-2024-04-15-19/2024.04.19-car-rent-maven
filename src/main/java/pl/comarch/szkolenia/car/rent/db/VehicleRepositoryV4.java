package pl.comarch.szkolenia.car.rent.db;

import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;

public class VehicleRepositoryV4 implements IVehicleRepository {
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
