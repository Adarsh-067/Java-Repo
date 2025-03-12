public class challenge11 {
    // find max number in array

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int[] array = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: array){
            if (max < num){
                max = num;
            }
        }
        System.out.println("maximum number is: " + max);
    }
}
