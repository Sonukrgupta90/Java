import java.util.*;
class Lowertoupper
{
	public static void main(String args[])
	{
	    String str,str1=" ";
	    char character;
            int i;
	    Scanner in=new Scanner(System.in);
	    System.out.print("'enter a string");
	    str=in.nextLine();
	    for(i=0;i<str.length();i++)
	    {
	    character=str.charAt(i);
            str1=str.toUpperCase();
}
	    System.out.println(str1);
}
}	