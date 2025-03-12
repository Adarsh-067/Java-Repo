public class ForLO {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int i = 0;
        while (i <= 100){
            System.out.print(i + " ");
            i++;
        }

        int count = 0;
        for (int j =0; j <=100; j+=2) {
            System.out.println(j + " ");
            count++;
        }
        System.out.println("count: " + count);
    }
}
