import  java.io.*;
import java.util.Scanner;


class non
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Given String:");
        String inputStr =sc.nextLine();
        boolean flag = true;

        for(char i :inputStr.toCharArray())
        {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    }
}