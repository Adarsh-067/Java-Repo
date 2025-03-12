package Problems;

public class Solutionss {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] + nums[i + 1] == target){
                nums[0] = i;
                nums[1] = i+1;
            }
        }
        return array;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Solutionss s = new Solutionss();
        int[] arr = {2,7,3,6,5};
        int target = 5;

        System.out.println(s.twoSum(arr,target));
    }
}

