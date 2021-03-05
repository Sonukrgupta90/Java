import java.util.*;

public class slargest
{
    public static void main(String args[])
    {
        String str[]=new String[5];
        int i,lcount=0;

        Scanner in = new Scanner(System.in);
        System.out.println("enter 5 string");
        for(i=0;i<5;i++)
        str[i]=in.next();

        lcount=str[0].length();
        for(i=1;i<5;i++)
        {
            if(str[i].length()>lcount)
               lcount=str[i].length();
        }

            for(i=0;i<5;i++)
            {
                if(str[i].length()==lcount)
                System.out.println(str[i]);
            }
    }
    
}
