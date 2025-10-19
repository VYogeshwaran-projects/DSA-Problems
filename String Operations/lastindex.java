import java.io.*;
import java.util.*;

public class lastindex
{

public static int inx(String s)
{

s = s.trim();

int lastSpaceIndex = s.lastIndexOf(' ');

int index = s.length() - lastSpaceIndex - 1;

return index;

}

public static void main(String a[])
{
String s= "Hello World";

System.out.println("The Last Index Of The String= "+inx(s));
}
}