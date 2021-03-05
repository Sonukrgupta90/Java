import java.util.*;
class cfact
{
  int a,p=1;
 
  public void cfact(int a)
{  
    int i,n=a;
    for(i=1;i<=n;i++)
    p=p*1;
    show();
}
    public void show()
{  
  System.out.print("factorial of a no is"+p);
}
public static void main(String args[])
{
  cfact f1=new cfact(5);
   f1.show();
}
} 