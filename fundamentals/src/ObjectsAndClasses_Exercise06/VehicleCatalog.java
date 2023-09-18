package ObjectsAndClasses_Exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

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

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

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

            for (Vehicle car : cars) {
                if (car.getModel().equals(model)) {
                    System.out.println(car);
                    break;
                }
            }

            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.println(truck);
                    break;
                }
            }
        }

        double averageCarsHorsepower = calculateAverageHorsepower(cars);
        double averageTrucksHorsepower = calculateAverageHorsepower(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucksHorsepower);

        scanner.close();
    }

    static double calculateAverageHorsepower(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            return 0.0;
        }

        int totalHorsepower = 0;
        for (Vehicle vehicle : vehicles) {
            totalHorsepower += vehicle.getHorsepower();
        }

        return (double) totalHorsepower / vehicles.size();
    }

    static class Vehicle {
        private final String type;
        private final String model;
        private final String color;
        private final int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getModel() {
            return model;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return "Type: " + (type.equals("car") ? "Car" : "Truck") + "\n" +
                    "Model: " + model + "\n" +
                    "Color: " + color + "\n" +
                    "Horsepower: " + horsepower;
        }
    }
}