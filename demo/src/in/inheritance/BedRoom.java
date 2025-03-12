package in.inheritance;

class BedRoom extends Room {
     int height;

    public BedRoom(int length, int width , int height) {
        super(length, width);
        this.height = height;
    }

    int volume(){
        return length * width * height;
    }
}
