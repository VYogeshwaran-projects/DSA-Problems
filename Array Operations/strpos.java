import java.io.*;
import java.util.Scanner;
class strpos
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);


System.out.println("Enter the String1:");
String n= sc.nextLine();

System.out.println("Enter the String2:");
String n1= sc.nextLine();

int input = n.indexOf(n1);

System.out.println("Index Position="+input);
}
}