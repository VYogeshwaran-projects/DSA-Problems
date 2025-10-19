import java.io.*;
import java.util.*;
class dis
{
public static void main(String s[])
{
int a[]=new int[]{1,2,2,3,5,6,7};
Set<Integer> ob = new HashSet<>();
for(int num : a)
{
ob.add(num);
}
System.out.println("The Distinct Elements are:"+ob);
}
}