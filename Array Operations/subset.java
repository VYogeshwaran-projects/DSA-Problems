import java.io.*;
import java.util.*;
class sub
{
static boolean isSubset(int a1[],int a2[],int m,int n)
{
int i=0,j=0;//a2=4=n,a1=6=m;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(a2[i]==a1[j])
{
break;
}
}
if(j==m)
{
return false;
}
}
return true;
}

public static void main(String s[])
{
int a1[]={11,12,13,14,15};
int a2[]={16};
int m=a1.length;
int n=a2.length;
if(isSubset(a1,a2,m,n))
{
System.out.println("a2 is a subset of a1");
}
else
{
System.out.println("a2 is a distinct of a1");
}
}
}
