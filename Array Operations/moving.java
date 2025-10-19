import java.util.Arrays;

class mov {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 3, 4, 5};
        int n = nums.length;
        int last = 0;
   
for ( int i=0;i<n;i++)
{
if(nums[i]!=0)
{
nums[last]=nums[i];
last++;
}
}

System.out.println(last);

for ( int i=last;i<n;i++)
{
nums[i]=0;
}

        System.out.println("The Moved Array = "+Arrays.toString(nums));  // Output: true
    }
}
