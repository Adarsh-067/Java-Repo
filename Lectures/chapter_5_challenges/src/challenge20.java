class Circle {
    //find Area of a circle and getCircumference
     int radius;

     Circle(int radius){
         this.radius = radius;
     }

     double getCircumference(){
         return 2 * Math.PI * radius;
     }

     double getArea(){
         return Math.PI * Math.pow(radius,2);
     }

     @Override
     public String toString() {
         return "Area of a circle: " + getArea() + " , "
                                     + " Area of a circumference: "
                                     + getCircumference();
     }

     public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        Circle first = new Circle(6);
        System.out.println(first);
    }
}
