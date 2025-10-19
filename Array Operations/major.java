import java.io.*;
import java.util.*;
class maj
{
public static void main(String a[])
{
int s[]={1,2,2,1,1};// sorted = {1,1,1,2,2}
int result=0;

Arrays.sort(s);

System.out.println("The Majority Element in the Array = "+s[s.length/2]);

}
}