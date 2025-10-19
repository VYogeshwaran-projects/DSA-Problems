import java.io.*;
import java.util.*;
class merge
{
public static void main(String s[])
{
int a[]={2,4,6,7,8,9};
int a1[]={1,3,5};
int i=0;
int c=0; 
System.out.println("Before Merged");

for(i=0;i<a.length;i++)
{
System.out.print(a[i]);
if(i<a.length-1)
{
System.out.print(",");
}
}

System.out.println();

for(i=0;i<a1.length;i++)
{
System.out.print(a1[i]);
if(i<a1.length-1)
{
System.out.print(",");
}
}


Set<Integer> mergedSet=new TreeSet<>();



for(int num : a)
{
mergedSet.add(num);
}

for(int num : a1)
{
mergedSet.add(num);
}

System.out.println("\nPrint the Merged Array:");

for(int num : mergedSet)
{
System.out.print(num);
if(c++<mergedSet.size()-1)
{
System.out.print(",");
}
}
}
}
