import java.io.*;
import java.util.*;
class hash
{
public static int[] twosum (int nums[] , int target)
{
int n = nums.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(nums[i]+nums[j]==target)
{
return new int[] {i,j};
}
}
}
return new int[] {};
}
public static void main(String a[])
{
int nums[]=new int[]{2,7,11,15};
int target=9;
int result[]=twosum(nums,target);
System.out.println("output:["+result[0]+","+result[1]+"]");
}
}
