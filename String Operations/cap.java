import java.io.*;
import java.util.Scanner;
class cap
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the given string:");
String s=sc.nextLine();
String str[]=s.split("\\s");
String newstr="";

for(String string : str)
{
int length = string.length();
String firstchar = s.substring(0,1);
String restchar = s.substring(1,length-1);
String lastchar = Character.toString(string.charAt(length-1));

newstr=newstr+firstchar.toUpperCase()+restchar+"  ";
}

System.out.println("The Result String= "+newstr);

}
}
