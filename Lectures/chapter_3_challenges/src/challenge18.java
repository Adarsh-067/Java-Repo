public class challenge18 {
    //Array is palindrome or not

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        int[] array = ArrayUtility.inputArray();
        boolean isResult = isPalindrome(array);
        if (isResult){
            System.out.println("your Array is palindrome");
        }else {
            System.out.println("your Array is not palindrome");
        }

    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length / 2){
            if (arr[i] != arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}