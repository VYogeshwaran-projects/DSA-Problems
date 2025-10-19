import java.io.*;
import java.util.*;

public class revs
{
public static void main(String a[])
{
String s="hello";

s= s.trim();

StringBuilder st =new StringBuilder(s);


System.out.println("The Reversed String = "+st.reverse().toString());
}
}