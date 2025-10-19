import java.io.*;
import java.util.*;
class hm
{
public static void main(String a[])
{
HashMap<String,String> h=new HashMap<String,String>();
h.put("India","NewDelhi");
h.put("England","Paris");
h.put("America","NewYorkCity");
h.put("Switzerland","Geneva");
//Collections.sort(s,Collections.reverseOrder());


System.out.println("The Given Map Values with Hm="+h.get("India"));

//for(String i : h.values())
for(String i : h.keySet())
{
System.out.println("key: "+i+" value: "+h.get(i));
}

}
}