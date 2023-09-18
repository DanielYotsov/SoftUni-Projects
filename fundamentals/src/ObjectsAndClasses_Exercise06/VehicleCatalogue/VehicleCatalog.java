package ObjectsAndClasses_Exercise06.VehicleCatalogue;

public class VehicleCatalog {

    private final String type;
    private final String model;
    private final String color;
    private final int horsepower;

    public VehicleCatalog(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Type: " + type.substring(0, 1).toUpperCase() + type.substring(1) + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsepower;
    }
}


