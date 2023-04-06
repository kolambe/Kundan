class Q25{


public static void main(String [] args)
{

   /* .Write a program to convert state of float instance into byte, 
       short, int. ,  and double.   */

       Float f=12.3f;



       int i= f.intValue();
       System.out.println("The integer value of f is i="+i);

       short s = f.shortValue();
       System.out.println("The short value of f is s="+s);

       byte b = f.byteValue();
       System.out.println("The int value of byte is f="+b);

     

       double d = f.doubleValue();
       System.out.println("The double value of f is d="+d);



}



}
