package in.kgcoding.methodOverriding;

class car extends vehicle {

    int noOfTyre;

    car(){
        super();
    }

    car(int noOfTyre){
        super(noOfTyre);
    }
   public int noOfDoors(){
        return 5;
    }

   /* @Override
    public void start() {
        System.out.println(super.getNoOfTyre());
        System.out.println("car is stating...");
    }*/
}
