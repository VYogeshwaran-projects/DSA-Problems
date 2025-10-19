import java.io.*;
import java.util.*;
class ch
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);

if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println("The Given Character is an Vowel");
}
else
{
System.out.println("The Given Character is not an Vowel");
}

System.out.println("The Given Character="+ch);
}
}