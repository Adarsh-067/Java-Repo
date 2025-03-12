public class FinalKeyword {

    final double PI = 3.1412;
    final String NAME = "Adarsh";

    void tester(){
       /* NAME = "hello";
        PI = 52;*/
    }
    public static void main(String[] args) {
        FinalKeyword hello = new FinalKeyword();
        System.out.println(hello.NAME);
    }
}
