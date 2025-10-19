import java.io.*;
import java.util.Scanner;
class rearr
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value Seperated by commas:");
String input = sc.nextLine();
String parts[]= input.split(",");
int nums[]=new int[parts.length];

for(int i=0;i<parts.length;i++)
{
nums[i]=Integer.parseInt(parts[i].trim());
}

int out[]=new int[nums.length];

out[0]=nums[8];
out[1]=nums[1];
out[2]=nums[6];
out[3]=nums[3];
out[4]=nums[4];
out[5]=nums[5];
out[6]=nums[2];
out[7]=nums[7];
out[8]=nums[0];

for(int i=0;i<out.length;i++)
{
System.out.print(out[i]);
if(i<out.length-1)
{
System.out.print(",");
}
}
}
}