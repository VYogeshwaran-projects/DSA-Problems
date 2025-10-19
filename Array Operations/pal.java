import java.io.*;
import java.util.*;
class pal
{
public static boolean ispal(int number)
{
int i;
int onumber = number;
int reversednumber=0;
while(number>0)
{
int digit= number%10;
reversednumber = reversednumber*10+digit;
onumber=number/10;
}
return reversednumber==onumber;  
}
public static void main(String a[])
{
System.out.println(ispal(123));
}
}