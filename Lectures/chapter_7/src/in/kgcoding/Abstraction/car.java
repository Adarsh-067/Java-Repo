package in.kgcoding.Abstraction;

public class car extends vehicle{

    @Override
    public void carStartSound() {
        System.out.println("phat phat phat ///////");
    }

    public car(int noOfTyre) {
        super(noOfTyre);
    }

    private int noOfDoors;

    @Override
    public void getSetGo() {
        System.out.println("start....");
    }
}
