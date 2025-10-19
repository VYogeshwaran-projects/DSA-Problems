import java.io.*;
import java.util.*;
class rep
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("The Given String:");
String s=sc.nextLine();
s=s.replaceAll("[^a-zA-Z]","");

/*for(int i=0;i<s.length();i++)
{
if(s.charAt(i)<'A' || s.charAt(i)>'Z' || s.charAt(i)<'a' || s.charAt(i)>'z')
{
s=s.substring(0,i)+s.substring(i+1);
i--;
}
}*/

System.out.println("Print= "+s);
}
}
