package in.kgcoding.inheritance;

public class vehicle {
  protected int noOfTyre;

 protected void travel(){
      System.out.println("I am going to place A to B using noOfTyre: " + noOfTyre);
  }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }
}
