import java.util.*;
import java.io.*;

class pro
{
public static void main(String a[])
{
int nums[]={1,2,3,4};
int n = nums.length;
int product = 1;

for(int i=0;i<n;i++)
{
product = nums[i] * product;
}

System.out.println("The Product Value is="+product);

}
}