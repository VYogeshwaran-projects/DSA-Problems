import java.io.*;
import java.util.*;
class mis
{
public static void main(String v[])
{
int nums[]={1,2,3,4,5,7,9};
int n=nums.length;

Set<Integer> s=new HashSet<>();

for(int i=1;i<=9;i++)
{
s.add(i);
}

//s=1..9;

for(int num : nums)
{
s.remove(num);
}

List<Integer> l=new ArrayList<>(s);

System.out.println("The Missing Values = "+l);

}
}