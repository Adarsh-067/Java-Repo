package in.inheritance;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to inheritance concept!");
//        Room r = new Room(25,25);
        BedRoom bd = new BedRoom(25,25,12);
        car swift = new car();
        swift.message();
//        System.out.println(swift.getColour());
        System.out.println(swift.vechilesType);
        System.out.println(swift.noOfTyre);

//        System.out.println("Area: "+bd.Area());
//        System.out.println("Volume: "+bd.volume());
//        System.out.println(bd.height);
//        bd.Commit();


    }
}
