class Swapping 
{
	public static void main(args[o]) 
	{  
		int x=Integer.ParseInt(args[0]);
		int y=Integer.ParseInt(args[1]);
		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("swapp value is"+x+" "+y );
	}
}
