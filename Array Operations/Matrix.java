import java.util.Scanner;
import java.io.*;
class main
{
public static void main(String s[])
{
int sum=0;
int a[][]=new int[10][10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]);
sum=sum+a[i][i];
System.out.print(sum);
}
}
}
}