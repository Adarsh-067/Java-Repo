package in.kgcoding.Abstraction;

public abstract class vehicle implements transport{
    private int noOfTyre;

    public abstract void carStartSound();

    public vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    void commute(){
        System.out.println("going.......");
    }
}
