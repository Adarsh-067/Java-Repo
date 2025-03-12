public class challenge14 {
    // sum of positive number and skip negative number

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int[] array = ArrayUtility.inputArray();

        int sum = 0;
        for (int num: array){
            if (num < 0){
                continue;
            }else {
                sum += num;
            }
        }
        System.out.println("\nsum of your positive number is: " + sum);
    }
}
