import java.util.*;
import java.io.*;

class sum
{
public static void main(String s[])
{
int a[]={1,2,3,4,5,6,7,8,9};
int n=a.length;
int sum = 0;

for(int i=0;i<n;i=i+2)
{
sum=sum+a[i];
}

System.out.println("The Given Maximum Sum Value = "+sum);

}
}