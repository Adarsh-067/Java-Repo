public class Car {

//    static String name = "Hello";
    int noOfSheet;
    String colour;
    float currentFuel;
    int noOfWheels;
    int maxSpeed;

    static {
        System.out.println("i am static block");
    };

    {
        System.out.println("i am init block");
    };

   /* Car(){                     // default constructor
        noOfSheet = 5;
        colour = "black";
        currentFuel = 2;
        noOfWheels = 4;
        maxSpeed = 999;
    }*/

    Car(String colour , int maxSpeed , int noOfWheels){    // parameterized constructor
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.noOfWheels = noOfWheels;
    }

    public Car start(){
       if (currentFuel <= 1 ){
           System.out.println("fuel is low, please add fuel");
       }else  if (currentFuel <= 3){
           System.out.println("car is reserve mode, please add fuel");
       }else {
           System.out.println("car is started...bruhhhh.....");
       }
       return this;
    }

    public void drive(){
      currentFuel--;
        System.out.println("car is drive");
    }

    public void AddFuel(int currentFuel){
        this.currentFuel += currentFuel;
    }

    public void stop(){
        System.out.println("car is stop");
    }
}
