class Q17{


public static void main(String [] args)
{

   /* .Write a program to convert state of Byte instance into byte, 
       short, int. long, float and double.   */

       Integer i=14;


       int a= i.intValue();
       System.out.println("The integer value of i is a="+a);

       short s = i.shortValue();
       System.out.println("The short value of i is s="+s);

       byte b = i.byteValue();
       System.out.println("The int value of byte is b="+b);

       long l = i.longValue();
       System.out.println("The long value of i is l="+l);

       float f = i.floatValue();
       System.out.println("The float value of i is f="+f);

       double d = i.doubleValue();
       System.out.println("The double value of i is d="+d);



}



}
