import java.io.*;
import java.util.Scanner;
class exp
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the given string:");
String s=sc.nextLine();
String Result=s.replaceAll("[(),{}]","");

System.out.println("The Replaced String= "+Result);

}
}
