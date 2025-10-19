import java.io.*;
import java.util.Scanner;
class sum
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the given string:");
String s=sc.nextLine();
int sum=0;

for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i)))
{
sum=sum+Character.getNumericValue(s.charAt(i));
}
}

System.out.println("The Sum of the String Values= "+sum);

}
}
