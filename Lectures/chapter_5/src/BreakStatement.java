public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        System.out.println("before loop");
     /*   for (int i = 0; i < 1000; i++) {
            if (i == 199){
                break;
            }
            System.out.println(i);
        }
        System.out.println("stop loop");*/

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("stop loop");
    }
}
