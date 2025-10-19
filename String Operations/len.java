import java.io.*;
import java.util.*;
class len
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the given string:");
String s=sc.nextLine();
int length=0;

for(char ch : s.toCharArray())
{
length++;
}

System.out.println("The  Length of  Given String= "+length);
}
}