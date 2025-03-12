public class challenge17 {
    // Reverse Array

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
       int[] arr = ArrayUtility.inputArray();
       reverseArr(arr);
        System.out.println("\nReverse array is here: ");
        System.out.print("=> ");
       ArrayUtility.displayArray(arr);
    }
    public static void reverseArr(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
    }
}
