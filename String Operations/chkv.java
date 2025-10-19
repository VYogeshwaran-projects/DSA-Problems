import java.io.*;
import java.util.*;
class chkv
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the given string:");
String s=sc.nextLine();
char ch[]=s.toCharArray();
int vowel=0;

for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='u')
{
vowel++;
}
}


System.out.println("The No of Vowels In a String = "+vowel);
}
}