import java.io.*;
import java.util.*;

public class index
{
public static int strs(String hay,String may)
{

if(may.isEmpty()) return 0;

return hay.indexOf(may);
}
public static void main(String a[])
{
String hay="Johnny Johnny";
String may="nny";
System.out.println("The Given Index Position="+strs(hay,may));
}
}