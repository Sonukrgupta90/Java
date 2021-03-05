import java.util.*;
public class Str_lar_no
{
    public static void main(String args[])
    {
        String str;
        char large;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        str=in.next();
        large=str.charAt(0);
        for(i=1;i<str.length();i++)

        if(str.charAt(i)>large)
        large=str.charAt(i);
        System.out.println("largest character is : "+large);

    }
        
}