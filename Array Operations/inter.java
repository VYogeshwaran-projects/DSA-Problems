import java.io.*;
import java.util.*;

class inter
{
public static void main(String s[])
{
int a[]={1,2,2,1};
int a1[]={2,2};
boolean used[]=new boolean[a1.length];

Arrays.sort(a);
Arrays.sort(a1);

List<Integer> l = new ArrayList<>();

int i=0,j=0;

for(i=0;i<a.length;i++)
{
for(j=0;j<a1.length;j++)
{
if(a[i]==a1[j]&&!used[j])
{
l.add(a[i]);
used[j]=true;
break;
}
}
}

System.out.println(l);

}
}