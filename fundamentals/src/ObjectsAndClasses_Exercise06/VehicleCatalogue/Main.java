package ObjectsAndClasses_Exercise06.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalog> cars = new ArrayList<>();
        List<VehicleCatalog> trucks = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }

            String[] vehicleData = input.split(" ");
            String type = vehicleData[0];
            String model = vehicleData[1];
            String color = vehicleData[2];
            int horsepower = Integer.parseInt(vehicleData[3]);

            VehicleCatalog vehicle = new VehicleCatalog(type, model, color, horsepower);

            if (type.equals("car")) {
                cars.add(vehicle);
            } else if (type.equals("truck")) {
                trucks.add(vehicle);
            }
        }

        while (true) {
            String model = scanner.nextLine();
            if (model.equals("Close the Catalogue")) {
                break;
            }

            for (VehicleCatalog car : cars) {
                if (car.getModel().equals(model)) {
                    System.out.println(car);
                    break;
                }
            }

            for (VehicleCatalog truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.println(truck);
                    break;
                }
            }
        }

        double averageCarsHorsepower = calculateAverageHorsepower(cars);
        double averageTrucksHorsepower = calculateAverageHorsepower(trucks);

        System.out.printf("Cars have average horsepower of %.2f.%n", averageCarsHorsepower);
        System.out.printf("Trucks have average horsepower of %.2f.%n", averageTrucksHorsepower);

        scanner.close();
    }

    static double calculateAverageHorsepower(List<VehicleCatalog> vehicles) {
        if (vehicles.isEmpty()) {
            return 0.0;
        }

        int totalHorsepower = 0;
        for (VehicleCatalog vehicle : vehicles) {
            totalHorsepower += vehicle.getHorsepower();
        }

        return (double) totalHorsepower / vehicles.size();
    }
}
