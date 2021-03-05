import java.util.*;
class emp_info
{
    String name,fathername,address;
    public emp_info(String a,String b,String c)
    {
        name=a;
        fathername=b;
        address=c;

    }

    public void disp()
    {
        System.out.println(name+" "+fathername+" "+address+" ");
    }
}

class empd_info extends emp_info
{
    int dno;
    String dname;
    double basic;

    public empd_info(String a,String b,String c,int e,String f,double g)
    {
        super(a,b,c);
        dno=e;
        dname=f;
        basic=g;
    }
    public void disp()
    {
        super.disp();
        System.out.println(dno+" "+dname+" "+basic);
    }
    public static void main(String args[])
    {
        String name,fathername,address,dname;
        int no;
        double sal;

        Scanner in= new Scanner(System.in);
        System.out.println("enter name\nfathername\naddress\ndno\ndepartment\nsalary\n");
        name=in.nextLine();
        fathername=in.nextLine();
        address=in.nextLine();
        no=in.nextInt();
        dname=in.nextLine();
        sal=in.nextDouble();

        empd_info ed= new empd_info(name,fathername,address,no,dname,sal);
        ed.disp();
    }
}