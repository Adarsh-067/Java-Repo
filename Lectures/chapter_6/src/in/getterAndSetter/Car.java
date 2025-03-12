package in.getterAndSetter;

public class Car {
    private String carName;
    private String colour;
    private int fuelLevel;
    private int carPrice;

    public Car(String carName, String colour, int fuelLevel, int carPrice) {
        this.carName = carName;
        this.colour = colour;
        this.fuelLevel = fuelLevel;
        this.carPrice = carPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carName='").append(carName).append('\'');
        sb.append(", colour='").append(colour).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", carPrice=").append(carPrice);
        sb.append('}');
        return sb.toString();
    }
}
