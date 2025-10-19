import java.io.*;
import java.util.Scanner;
class hello
{
public static void main(String s[])
{
int a[]=new int[]{1,2,6,7};
int i,max,min;
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the no of elements:");
max=a[0];
min=a[0];
//Maximum value in array
for(i=0;i<a.length;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("The Maximum Value in the array="+max);
//Minimum Value in array
for(i=0;i<a.length;i++)
{
if(min>a[i])
{
min=a[i];
}
}
System.out.println("The Minimum Value in the array="+min);
}
}
