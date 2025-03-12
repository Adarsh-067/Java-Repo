public class challenge14 {
    // Maximum and minimum element in Array
    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int[] array = ArrayUtility.inputArray();
        int max = max(array);
        int min = min(array);
        System.out.println("max number is: " + max);
        System.out.println("min number is: " + min);
    }

    public static int min(int[] arr){
        int i = 1;
        int min = arr[0];
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] arr){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int i = 1;
        int max = arr[0];
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
