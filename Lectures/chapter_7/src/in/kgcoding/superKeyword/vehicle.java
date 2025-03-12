package in.kgcoding.superKeyword;

public abstract class vehicle {
    private int noOfTyre;

    vehicle(){
        noOfTyre = 0;
    }

    vehicle(int noOfTyre){
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre(){
        return noOfTyre;
    }
   abstract void start();
}
