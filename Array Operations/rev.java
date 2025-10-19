import java.io.*;
import java.util.*;
class rev
{
public static void main(String a[])
{
int s[]=new int[]{1,3,2};
//int g[]=new int[s.length];
//s=g;
System.out.println("Print the Values"); 
for(int i=0;i<s.length;i++)
{
System.out.print(s[i]);
}
System.out.println("\nReverse the Values");
for(int i=2;i>=0;i--)
{
System.out.print(s[i]);
}
}
}