import java.util.*;

public class Str_com 
{
    public static void main(String args[])
    {
        String str1 = new String();
        String str2 = new String();
        String str3 = "hello";

        Scanner in = new Scanner(System.in);
        System.out.println("enter string 1 :");
        str1=in.next();
        

        System.out.println("enter string 2 :");
        str2 =in.next();

        if(str1==str2)
        System.out.println("string is same");
        else
        System.out.println("not same");

    }
       
}
