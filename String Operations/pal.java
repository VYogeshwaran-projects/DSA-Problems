import java.io.*;
import java.util.*;
class pal
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("The Given String:");
String s=sc.nextLine();
String s1="";

for(int i=s.length()-1;i>=0;i--)
{
s1=s1+s.charAt(i);
}

System.out.println("The Reversed String = "+s1);

if(s.equals(s1))
{
System.out.println("The Given String is a Palindrome");
}
else
{
System.out.println("The Given String is not a Palindrome");
}


//s1=s.replaceAll("[aeiou]","");
//System.out.println("The Removed String="+s1);
}
}
