 //class q9
//    {
//          public static void main(String args[])
//          {
//             String s="9";
//             byte b=Byte.decode(s);
            
//             System.out.println(b);
//          }
//    }

// Assignment 1 9.2]
class q9{


public static void main(String [] args)
{

   /* .Write a program to convert state of Byte instance into byte, 
       short, int. long, float and double.   */

       Byte b=14;


        b= b.byteValue();
       System.out.println("The byte value of b is b="+b);

       short s = b.shortValue();
       System.out.println("The short value of b is s="+s);

       int i = b.intValue();
       System.out.println("The int value of b is i="+i);

       long l = b.longValue();
       System.out.println("The long value of b is l="+l);

       float f = b.floatValue();
       System.out.println("The float value of b is f="+f);

       double d = b.doubleValue();
       System.out.println("The double value of b is d="+d);



}



}