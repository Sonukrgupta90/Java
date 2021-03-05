class first

{
    int x;
    public void disp()
    {
        System.out.println(""+x);
    
    }

}

class super01
{   int x;
    public void super01()
    {
        
        x=50;
    }
   


public void disp()
{

    System.out.println(""+x);
}

public static void main(String args[])
{
    super01 a1=new super01();
    a1.disp();

}}