import java.io.*;
import java.util.Scanner;
class mod
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the given string:");
String original=sc.nextLine();
System.out.println("Enter the Replace String:");
String replace=sc.nextLine();
System.out.println("Enter the String to replace:");
String modify=sc.nextLine();

String modified=replaceSubstring(original,replace,modify);

System.out.println("The Modified String= "+modified);

}
  public static String replaceSubstring(String original, String toReplace, String newString) {
        return original.replace(toReplace, newString);
    }
}
