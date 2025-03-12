package in.inheritance;

class car extends vhecales {
    private String colour;
    private int fuel;
    String carName;
    String brand;

   /* public car(String colour, int fuel, String carName, String brand) {
        super();
        this.colour = colour;
        this.fuel = fuel;
        this.carName = carName;
        this.brand = brand;
    }
*/
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
