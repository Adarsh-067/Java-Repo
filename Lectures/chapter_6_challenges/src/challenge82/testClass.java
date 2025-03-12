package challenge82;

public class testClass {
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");

        ArrayOperations op = new ArrayOperations(new int[]{1,2,3,4});
        ArrayOperations.statistics st = op.new statistics();
        System.out.println(st.mean());
    }
}
