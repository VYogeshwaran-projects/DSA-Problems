import java.io.*;
import java.util.*;
class rmv
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("The Given String:");
String s=sc.nextLine();
String s1="";
s1=s.replaceAll("[aeiou]","");
System.out.println("The Removed String="+s1);
}
}
