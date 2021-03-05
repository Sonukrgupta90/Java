import java.util.*;
import java.lang.*;


class first
{
    int x,y;
    public first(int a,int b)
    {
        x=a;
        y=b;         
    }
    public void disp()
    {
       System.out.println(""); 
       System.out.println("'numbers are from parent class   and  value is passed by an argument i.e. (constructor)'");
       System.out.println("=======================================================================================\n"); 
       System.out.println("number 3 is :"+x+"\nnumber 4 is :"+y);
    }
}

class super11 extends first
{
    int j;
    public super11(int a,int b,int c)
   { super(a,b);
     j=c;
   }

   public void disp()
   {
       super.disp();
       System.out.println("");
       System.out.println("'number are from sub class or derived class  and value is passed by an argument i.e. (constructor)'");
       System.out.println("===================================================================================================\n");
       System.out.println("number 3 is :"+x+"\nnumber 4 is :"+y);
       System.out.println("number 5 is :"+j);

   }

  

   public static void main(String args[])
   {
       int i,y;
       Scanner in = new Scanner(System.in);
       System.out.println("--------------------");
       System.out.print("enter number 1 :");
       i=in.nextInt();
       System.out.print("enter number 2 :");
       y=in.nextInt();
       System.out.println("--------------------");
       System.out.println("");
       System.out.println("'numbers are from : input by user'");
       System.out.println("===================================\n");
       System.out.println("number 1 is :"+i+"\nnumber 2 is :"+y);
       super11 s5 = new super11(30,50,60);
        s5.disp();
   }
}