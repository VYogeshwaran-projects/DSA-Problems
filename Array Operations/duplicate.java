import java.util.Arrays;

class dup {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Arrays.sort(nums);  // sort the array

        boolean hasDuplicate = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                hasDuplicate = true;
                break;
            }
        }

        System.out.println(hasDuplicate);  // Output: true
    }
}
