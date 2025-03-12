package in.challenge1;

public class circle extends shape{
    private int radius;
    circle(int radius){
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
