package in.Abstraction.vehicle;

public class car implements vehicle {
    @Override
    public void getSetGo() {
        System.out.println("Go");
    }

    @Override
    public void vehicleStart() {
        System.out.println("Car is Start!");
    }

    @Override
    public void vehicleStop() {
        System.out.println("Car is Stop!");
    }
}
