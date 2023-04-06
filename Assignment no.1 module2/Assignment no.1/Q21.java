class Q21{


public static void main(String [] args)
{

   /* .Write a program to convert state of long instance into byte, 
       short, int. , float and double.   */

       Long l=1234L;



       int i= l.intValue();
       System.out.println("The integer value of l is i="+i);

       short s = l.shortValue();
       System.out.println("The short value of l is s="+s);

       byte b = l.byteValue();
       System.out.println("The int value of byte is b="+b);

      
       float f = l.floatValue();
       System.out.println("The float value of l is f="+f);

       double d = l.doubleValue();
       System.out.println("The double value of l is d="+d);



}



}
