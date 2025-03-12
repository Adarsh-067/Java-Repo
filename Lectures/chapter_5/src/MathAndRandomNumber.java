public class MathAndRandomNumber {
    /**
    *
    * this is my method
    * */
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
       /* System.out.println(Math.abs(-100));
        System.out.println(Math.ceil(5.02));
        System.out.println(Math.floor(7.6));
        System.out.println(Math.round(9.6));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.max(12,102));
        System.out.println(Math.min(12,102));*/

        int random = (int) Math.round(Math.random()*10);

        for (int i = 0; i < 10; i++) {
            random = (int) Math.round(Math.random()*10);
//            System.out.println(random);
        }
    }

    /**
     * this is my second method in java
     * */
    public static void isarm(){

    }
}
