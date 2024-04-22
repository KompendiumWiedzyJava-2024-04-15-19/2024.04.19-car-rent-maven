package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;

public interface IGUI {
    String showMenu();
    void listVehicles(
            Collection<Vehicle> vehicles);
    String readPlate();
    void showSuccess(boolean result);
}
