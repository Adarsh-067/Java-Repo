 public class challenge15 {
   // sorted Array
    public static void main(String[] args) {
       System.out.println("Hello, Adarsh welcome to java world!\n");
       int[] arr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);
        if (isInc || isDec){
            System.out.println("your Array is sorted ☻");
        }else {
            System.out.println("your Array is not sorted ☺");
        }
    }

    public static boolean isIncreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] < array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] > array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
 }
