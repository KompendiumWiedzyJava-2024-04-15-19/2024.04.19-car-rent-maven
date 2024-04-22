package pl.comarch.szkolenia.car.rent.db;

import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.model.Bus;
import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.Truck;
import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
@Component
public class VehicleRepository implements IVehicleRepository {
    private final Map<String, Vehicle> vehicles =
            new HashMap<>();

    public VehicleRepository() {
        this.vehicles.put("KR11", new Car("Toyota",
                "Corolla",
                "KR11",
                300.00));
        this.vehicles.put("KR22", new Car("Kia",
                "Ceed",
                "KR22",
                200.00));
        this.vehicles.put("KR33", new Car("Fiat",
                "126p",
                "KR33",
                400.00));
        this.vehicles.put("KR44", new Car("Mercedes",
                "C",
                "KR44",
                500.00));
        this.vehicles.put("KR55", new Car("BMW",
                "3",
                "KR55",
                500.00));
        this.vehicles.put("KR66", new Bus("Solaris",
                "1000",
                "KR66",
                1000.00,
                50));
        this.vehicles.put("KR77", new Bus("Mercedes",
                "Suer",
                "KR77",
                1000.00,
                60));
        this.vehicles.put("KR88", new Truck("Volvo",
                "XXX",
                "KR88",
                2000.00,
                150));
    }

    public Collection<Vehicle> getVehicles() {
        return this.vehicles.values();
    }

    public boolean rentVehicle(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if (vehicle != null && vehicle.isRent()) {
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    /*public Optional<Vehicle> find(String plate) {
        for (Vehicle vehicle : this.vehicles.values()) {
            if(vehicle.getPlate().equals(plate)) {
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        VehicleRepository vehicleRepository =
                new VehicleRepository();
        Optional<Vehicle> vehicleBox = vehicleRepository.find("KR12");
        if(vehicleBox.isPresent()) {
            Vehicle v = vehicleBox.get();
            System.out.println(v.getBrand());
        }
    }*/
}
