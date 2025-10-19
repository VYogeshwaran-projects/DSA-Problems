import java.io.*;
import java.util.Scanner;
class hello
{
public static void main(String s[])
{
int a[]=new int[10];
int i,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of elements:");
num=sc.nextInt();
for(i=0;i<num;i++)
{
a[i]=sc.nextInt();
if(a[i]%2==0)
{
System.out.println("The Given Number is Even="+a[i]);
}
else
{
System.out.println("The Given Number is Odd="+a[i]);
}
}
}
}
