package in.inheritance;

class Room {
     int length;
     int width;

    public Room(int length, int width){
        this.length = length;
        this.width = width;
    }

    int Area(){
        return length * width;
    }

    void Commit(){
        System.out.println("this room is boom so room that it's.");
    }
}
