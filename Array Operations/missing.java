import java.util.Arrays;

class mis {
    public static void main(String[] args) {
        int[] nums = {1, 0, 3};
        int n = nums.length;
        int expsum = n * (n + 1) / 2;
        int actsum = 0;
        

        for (int num : nums) {
            actsum = actsum + num;
            }

int result = expsum - actsum;


        System.out.println("The Missing Value = "+result);  // Output: true
    }
}
