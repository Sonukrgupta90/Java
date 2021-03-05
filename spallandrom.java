import java.util.*;
public class spallandrom
{
    public static void main(String args[])
    {
        String str,tstr;
        int i,l=0,k,m,flag=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        str=in.nextLine();
        str+=" ";
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                tstr=str.subString(int l,int i);
                for(k=0,m=tstr.length()-1;k<tstr.length()/2;k++,m--)
                {
                    if((tstr.charAt(k)-tstr.charAt(m))==0||(tstr.charAt(k)-tstr.charAt(m))==32||(tstr.charAt(k)-tstr.charAt(m))==-32)
                    flag=1;

                    else
                    {
                        flag=0;
                        break;
                    }

                    if(flag==1)
                    System.out.println(tstr);
                    l=i+1;

                }
            }
        }

    }
    
}
