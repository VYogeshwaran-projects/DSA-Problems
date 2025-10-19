import java.io.*;
import java.util.*;

class rept
{
public static void main(String s[])
{
int a[]={1,2,2,2,1};
int count = 0;

for(int i=0;i<a.length;i++)
{
if(a[i]==2)
{
count=count+1;
}
}

System.out.println(count);

}
}