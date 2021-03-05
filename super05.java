import java.util.*;

class first
{
    int x,y;
    String s1;

    public void input(int a,int b,String c)
   { 
       //System.out.println("enter date :\nmonth number :\nmonth name :");
    x=a;
    y=b;
    s1=c;
   }
    public void disp()
   {
        System.out.print("date is :"+x+"month number is :"+y+"month name is :"+s1);
   }
}

 /*class second exrends first
{
    int n;
    String s2;
    public void input(int a,int b,int c,String d,String e)
    {
        System.out.println("enter any no :\nentre your name :");
        super(a,b,c);
        n=d;
        s2=e;
    }
    public void disp()
    {

    super.disp();
    System.out.println("entre no is :"+n+"enter name is :"+s2);
    }

}
*/





public class super1 extends first 
{
    int n;
    String s2;

    public void input1(int a,int b,String c,int d,String e)
    {
        super(a,b,c);
        d=n;
        s2=e;


    }

    public void disp()
    {
        super.disp();
        System.out.println("entre no is :"+n+"enter name is :"+s2);
    }

    public static void main(String args[])

    {
        int x,y,z,n;
        String s1,s2,s3;
        Scanner in = new Scanner(System.in);
        System.out.println("enter date :\nenter month number :\nentre month name :\nentre any number :\nentre your name\nenter your birth date :\nentre your birth month :");
        
        x=in.nextInt();
        y=in.nextInt();
        in.nextLine();
        s1=in.next();

        n=in.nextInt();
        in.nextLine();
        s2=in.nextLine();
       

        z=in.nextInt();
        in.nextLine();
        s3=in.next();

        super1 ss1 =new super1(x,y,s1,n,s2);
        ss1.disp();

        
     

      

    }
    
}
