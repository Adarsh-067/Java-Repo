package in.kgcoding.methodOverriding;

public class vehicle {
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
    final void start(){
       System.out.println("vehicle is start...");
   }
}
