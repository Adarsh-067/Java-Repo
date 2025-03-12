package in.kgcoding.inheritance;

import in.getterAndSetter.twoWheeler;

public class inheritanceTest {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        vehicle veh = new vehicle();
        twoWheeler tw = new twoWheeler();
        motorCycle mot = new motorCycle();

        System.out.println(mot.noOfTyre);
        mot.setNoOfTyre(5);
        System.out.println(mot.noOfTyre);
        mot.travel();

    }
}
