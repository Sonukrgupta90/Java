class figure
{
    public double carea()
    {
        System.out.println("parent class");
    }
}

class rectangle extends figure
{
    double l,ar,b;
    public rectangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length and breath");
        l=in.nextInt();
    
        b=in.nextInt();
    }

    public double carea()
    {
        super.carea();
        ar=l*b;
        System.out.println("area is :"+ar);

    }
}

/*class triangle extends figure
{
    double b,h;
    public triangle(double x,double y)
    {
        b=x;
        h=y;

    }

    public double carea()
    {
        return(0.5*b*h);
    }
}
*/
class operation
{
    public static void main(String args[])
    {   figure f1;
        double ar;
        rectangle r1= new rectangle();
        //triangle t1=new triangle(2,4);
             r1.carea();
        System.out.println("=============================");
        System.out.println("area of a rectangle is : "+ar);
        System.out.println("=============================");

        //f1=t1;
        //ar=f1.carea();
        //System.out.println("area of a triangle is : "+ar);
        System.out.println("==============================");
    }
}