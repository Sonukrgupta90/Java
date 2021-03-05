import java.util.*;
import java.io.*;

public class vectorlist
{
    public static void main(String args[])throws IOException

{
    Vector v = new Vector();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("HOW MANY NUMBER YOU WANT TO ENTER IN A VECTOR");
    int n=Integer.parseInt(br.readLine());

    for(int i=0;i<n;i++)
    {
        System.out.println("enter integer number");
        int no=Integer.parseInt(br.readLine());
        v.addElement(new Integer(no));
        
    }
        System.out.println("initial vector size"+v.size());
        System.out.println("vector element before remove element");

        for(int index=0;index<v.size();index++)
        System.out.println(v.get(index));
        System.out.println("enter index of element to be deleted");

}
    
}
