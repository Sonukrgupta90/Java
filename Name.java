import java.util.Scanner;

class Name
{
	public static void main(String[] args) 
	{ int i,n;
		Scanner sc=new Scanner(System.in);
	/*System.out.println("enter a no");
	int n=sc.nextInt();
	*/String a[]=new String[5];
    System.out.println("entre names ");
     for(i=0;i<5;i++)
		 a[i]=sc.nextLine();
	 System.out.println("names are ");
            for(i=0;i<5;i++)
				System.out.println(a[i]+" ");
	}
}
