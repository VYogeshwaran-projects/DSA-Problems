import java.io.*;
import java.util.*;
class sin
{
public static void main(String a[])
{
int s[]={1,2,2,0};
int result=0;

for(int nums : s)
{
result=result^nums;
}

System.out.println(result);

}
}