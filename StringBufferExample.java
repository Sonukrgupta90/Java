class StringBufferExample
{  
    public static void main(String args[]){  
    StringBuffer sb=new StringBuffer("Hello ");  
    sb.append("Java"); 
    System.out.println("====================================");
    System.out.print("append of two string :"); 
    System.out.println(sb); 
    System.out.println("=====================================\n");

    sb.insert(1,"Java");
    System.out.print("insertion of string name 'java' in previous string at position '1' :");
    System.out.println(sb);
    System.out.println("========================================================================\n");
    

    sb.replace(1,3,"Java"); 
    System.out.print("replace of position [1,3) is : ");
    System.out.println(sb);
    System.out.println("=================================================\n");

    sb.delete(1,3);  
    System.out.print("delete of position [1,3) is : ");
    System.out.println(sb);
    System.out.println("==================================================\n");

    sb.reverse(); 
    System.out.print("reverse of string is : "); 
    System.out.println(sb);
    System.out.println("====================================================\n");

    }
}