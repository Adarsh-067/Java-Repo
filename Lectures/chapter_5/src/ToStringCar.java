public class ToStringCar {
    int noOfWheels;
    String colour;
    int noOfSheets;
    String carName;

    public ToStringCar(int noOfWheels, String colour, int noOfSheets, String carName) {
        this.noOfWheels = noOfWheels;
        this.colour = colour;
        this.noOfSheets = noOfSheets;
        this.carName = carName;
    }

   /* @Override
    public String toString() {       // to string using concatenation
        return "ToStringCar{" +
                "noOfWheels=" + noOfWheels +
                ", colour= " + colour  +
                ", noOfSheets=" + noOfSheets +
                ", carName= " + carName +
                '}';
    }*/

    @Override
    public String toString() {      // to string using stringBuilder
        final StringBuilder sb = new StringBuilder("ToStringCar{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", colour='").append(colour).append('\'');
        sb.append(", noOfSheets=").append(noOfSheets);
        sb.append(", carName='").append(carName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        ToStringCar swift = new ToStringCar(4,"black",5,"swift");
        System.out.println(swift);
    }
}
