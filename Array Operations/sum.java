import java.io.*;
import java.util.Scanner;
public class sum
{
public static void main(String s[])
{
int n , sum = 0;
int a[]= new int[50];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array Size");
n=sc.nextInt();
System.out.println("Insert the Values");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=a[i]+1;
}
System.out.println("print the values");
System.out.println(sum);
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}