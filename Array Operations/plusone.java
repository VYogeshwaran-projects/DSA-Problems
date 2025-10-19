import java.io.*;
import java.util.Scanner;
class plus
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int i=0,j=0;
int a[]=new int[5];
int sum[]=new int[a.length];
System.out.println("Enter the digits:");
for(i=0;i<3;i++)
{
a[i]=sc.nextInt();
if(a[i]>0)
{
//sum[i]=a[i];
sum[i]=a[i]+1;
}
}
System.out.println("print the digits");
for(i=0;i<3;i++)
{
System.out.println(sum[i]);
}
}
}
