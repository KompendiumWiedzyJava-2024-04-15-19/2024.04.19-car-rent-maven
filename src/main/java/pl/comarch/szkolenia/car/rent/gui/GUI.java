package pl.comarch.szkolenia.car.rent.gui;

import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;
import java.util.Scanner;

@Component
public class GUI implements IGUI {
    private Scanner scanner = new Scanner(System.in);

    public String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public void listVehicles(
            Collection<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public String readPlate() {
        System.out.println("Type plate:");
        return scanner.nextLine();
    }

    public void showSuccess(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }
}
