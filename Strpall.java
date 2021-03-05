import java.util.*;
class Strpall
{
  public static void main(String args[])
{ String str=new String();
  String str1=new String();
  int i;
  Scanner in=new Scanner(System.in);
System.out.print("enter a string");
str=in.next();
for(i=str.length()-1;i>=0;i--)
str1+=str.charAt(0);
if(str.equalsIgnoreCase(str1.trim()))
System.out.print("pallondrom");
else
System.out.print("not pallon");
}}