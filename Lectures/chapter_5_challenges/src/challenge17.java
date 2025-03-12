import java.util.Scanner;

public class challenge17 {
    // palindrome using recursion

    public static void main(String[] args) {
        System.out.println("Hello, Adarsh welcome to java world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.next();

        System.out.println("your string is" + ((isPalindrome(str)?" palindrome":" not palindrome")));
    }

    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastStr = str.length() -1;
        if (str.charAt(0) != str.charAt(lastStr)){
            return false;
        }
        String newStr = str.substring(1,lastStr);
        return isPalindrome(newStr);
    }
}
