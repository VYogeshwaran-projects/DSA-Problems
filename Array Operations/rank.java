import java.util.*;
import java.io.*;
class pos
{
static void changearr(int input[])
{
int newarr[] = Arrays.copyOfRange(input,0,input.length);
Arrays.sort(newarr);
for(int i=0;i<input.length;i++)
{
for(int j=0;j<input.length;j++)
{
if(newarr[j]==input[i])
{
input[i]=j+1;
break;
}
}
}
}
public static void main(String s[])
{
int a[]={1,44,23,66};

changearr(a);

System.out.println(Arrays.toString(a));
}
}
