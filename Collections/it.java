import java.io.*;
import java.util.*;
class it
{
public static void main(String a[])
{
ArrayList<Integer> h=new ArrayList<Integer>();
h.add(12);
h.add(10);
h.add(9);
h.add(8);
//Collections.sort(s,Collections.reverseOrder());

Iterator<Integer> t = h.iterator();
//System.out.println("The Given List Values with AL="+t.next());

while(t.hasNext())
{
Integer i = t.next();
if(i<10)
{
t.remove();
}
}

System.out.println("The given list of values less than 10 = "+h);


}
}