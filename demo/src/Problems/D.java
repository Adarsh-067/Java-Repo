package Problems;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int digit;
        int temp = 0;
        while(x!=0){
            if(x%10==0){
                return false;
            }
            digit = x % 10;
            temp *= 10 + digit;
            x = x / 10;
        }
        return x == temp ? true : false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(123));
    }
}