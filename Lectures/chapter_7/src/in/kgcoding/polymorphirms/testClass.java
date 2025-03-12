package in.kgcoding.polymorphirms;

public class testClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        car c = new car();
        plane p = new plane();
//        vehicle vVeh = new vehicle();

        testCast(c);
        testCast(p);

       /* vehicle veh = new car();
      car cVehicle = (car) new vehicle();*/

//        Object ref = new car();
    }

    private static void testCast(vehicle var){
      /*vehicle v = new car();
      car c = (car) v;
      c.noOfDoors();*/

        var.start();
    }

}
