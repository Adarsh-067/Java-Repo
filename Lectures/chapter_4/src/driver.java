public class driver {

    static int minAgeOfDrive = 18;

    int Age;
    String dateOfLicence;

    public static void main(String[] args) {
      /* Car myCar = new Car();   // object declaration and initialization
        myCar.start();           // access class properties and behaviour using dot ( . ) operator
        myCar.AddFuel(6);
        System.out.println(myCar.currentFuel);
        myCar.start().drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.stop();
        myCar.AddFuel(10);
        System.out.println(myCar.currentFuel);*/


        // using this keyword

       /* Car swift = new Car();
        swift.AddFuel(6);
//        Car started = swift.start();
        swift.drive();
        swift.drive();
        swift.drive();
        swift.drive();
        System.out.println(swift.start().currentFuel);*/

        Car thar = new Car("black" , 500 , 5);
        System.out.println(thar.colour);
        System.out.println(thar.maxSpeed);
        System.out.println(thar.noOfWheels);


        // using static behaviour.

       /* driver d = new driver();
        System.out.println(d.Age);
//        System.out.println(d.minAgeOfDrive);
        System.out.println(driver.minAgeOfDrive);
//        System.out.println(Car.name);*/
    }
}
