import java.io.*;
import java.util.*;
class al
{
public static void main(String a[])
{
ArrayList<String> s=new ArrayList<String>();
LinkedList<String> l=new LinkedList<String>();
s.add("Ravi");
s.add("Rakesh");
s.add("Ravindran");
s.add("Roshan");
Collections.sort(s,Collections.reverseOrder());

l.add("BMW");
l.add("Lamborgini");
l.add("TATA");
l.add("RollsRoyce");
l.add("Cadillac");

//l.addFirst("TCS");
//l.addLast("TCS");
//l.removeFirst();


//System.out.println(l.getFirst());

System.out.println("The Given Array Values with AL="+s);
//s.remove(0);
//s.set(0,"arjun");
//s.clear();
for(String i : s)
{
System.out.println("The Given Array Values with loop="+i);
}
}
}