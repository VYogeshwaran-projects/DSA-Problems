import java.io.*;
import java.util.*;
class hs
{
public static void main(String a[])
{
LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
h.add(10);
h.add(5);
h.add(1);
h.add(22);
//Collections.sort(s,Collections.reverseOrder());


System.out.println("The Given Set Values with HS="+h.contains(1));
for(int i =0;i<4;i++)
{
if(h.contains(22))
{
System.out.println("The element is occured in the set position = "+i);
}
else
{
System.out.println("The element isnt occured in the set position = "+i);
}
}
}
}