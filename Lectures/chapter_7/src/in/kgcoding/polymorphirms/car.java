package in.kgcoding.polymorphirms;

class car implements vehicle{
   public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println("car is stating...");
    }
}
