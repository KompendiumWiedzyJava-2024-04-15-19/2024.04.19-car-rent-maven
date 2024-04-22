package pl.comarch.szkolenia.car.rent.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.db.IVehicleRepository;
import pl.comarch.szkolenia.car.rent.db.VehicleRepository;
import pl.comarch.szkolenia.car.rent.db.VehicleRepositoryV2;
import pl.comarch.szkolenia.car.rent.db.VehicleRepositoryV3;
import pl.comarch.szkolenia.car.rent.gui.GUI;
import pl.comarch.szkolenia.car.rent.gui.GUIv2;
import pl.comarch.szkolenia.car.rent.gui.IGUI;

@Component
public class Core {

    @Autowired
    private IVehicleRepository carRepository;
    @Autowired
    private IGUI gui;

    public void start() {
        boolean run = true;
        while (run) {
            switch(gui.showMenu()) {
                case "1":
                    gui.listVehicles(carRepository.getVehicles());
                    break;
                case "2":
                    gui.showSuccess(
                            carRepository.rentVehicle(
                                    gui.readPlate()));
                    break;
                case "3":
                    gui.showSuccess(
                            carRepository.returnVehicle(
                                    gui.readPlate()));
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("Wrong choose");
                    break;
            }
        }
    }
}
