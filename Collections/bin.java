import java.io.*;
import java.util.Scanner;
class bin
{
static void toBinary(int n)
{
int temp=n;
int binary[]=new int[32];
int i=0;
while(n>0)
{
binary[i]=n%2;
n=n/2;
i++;
}
if(n==0)
{
System.out.print("0");
return;
}

else
{
for(int j=i-1;j>=0;j--)
{
System.out.print(binary[j]);
}
}
//return 1;
}
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value=");
int n = sc.nextInt();
toBinary(n);
}
}
