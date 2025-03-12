package in.challenge1;

public class square extends shape{
    private int side;

    square(int side){
        this.side = side;
    }
    @Override
    double calculateArea() {
        return 4 * side;
    }
}
