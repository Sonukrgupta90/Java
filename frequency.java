import java.util.*;
public class frequency 

{
    public static void main(String args[])
   {
       String str;
       char ch,ch1;
       int i,j,fc=0,c=0;
       Scanner in=new Scanner(System.in);
       System.out.println("enter a string");
       str=in.nextLine();
       for(i=0;i<str.length();i++)
       { 
           ch=str.charAt(i);
           
           if(ch!=' ')
           
        
           {
                c=0;
                 for(j=i-1;j>=0;j--)
             { 
                  ch1=str.charAt(j);
                  if(ch==ch1)

                   {
                         c++;
                         break;
                    }
               else
               c=0;

              }
            }
           if(c==0)
           {
               System.out.print(str.charAt(i)+" "+"is"+" " );
               fc=0;
               for(j=i;j<str.length();j++)
               {
                   if(str.charAt(i)==str.charAt(j))
                   fc++;
               }
               System.out.println(fc);
           }
       }
   }
}
