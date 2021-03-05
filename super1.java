import java.util.*;

class first
{
    int x,y;
    //String s1;

    public void first(int a,int b)
   { 
       //System.out.println("enter date :\nmonth number :\nmonth name :");
    x=a;
    y=b;
   }
    public void disp()
   {
        System.out.print("date is :"+x+"month number is :"+y);
   }
}

 class second extends first
{
    int n;
    //String s2;
    public void second(int a,int b,int c)
    {
        //System.out.println("enter any no :\nentre your name :");
        super(a,b);
        n=c;
    }
    public void disp()
    {

    super.disp();
    System.out.println("entre no is :"+n);
    }

}






public class super1 extends second
{
    int n1;

    public void super1(int a,int b,int c,int d)
    {
        super(a,b,c,d);
        n1=d;
    


    }

    public void disp()
    {
        super.disp();
        System.out.println("entre no is :"+n1);
    }

    public static void main(String args[])

    {
        int x,y,n1,n;
        Scanner in = new Scanner(System.in);
        
        super1 ss1 =new super1(1,3,4,5);
        ss1.disp();

        
     

      

    }
    
}
