/*BMI Calculator 
You have been asked to write a Java program to implement a BMI (Body Mass 
Index) calculator. The program should have the following functionality:
The BMI calculator class should have the following fields:
a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.
The BMI calculator class should have the following methods:
a. A constructor to initialize the height and weight fields of the BMI calculator 
object.
b. Getter and setter methods.
c. Double calculateBMI(): A method to calculate the BMI of the person using the 
following formula: 
BMI = weight / (height * height).
Write a Java program that creates an object of the BMI calculator class, prompts the 
user to input their height and weight, sets the height and weight fields of the BMI 
calculator object using the setter methods, calculates the BMI using the 
calculateBMI() method, and prints the calculated BMI to the console. */

import java.util.Scanner;
class BmiCalc
{
    private double height;
    private double weight;

    BmiCalc()   // default constructor
    {
    }
    public void setHeight(double height)        // setter of height
    {
        //System.out.println(b);
        this.height = height;              // this.height - instance var , height - value which we catch
        //System.out.println(this.height);            
    }
    public double getHeight() {            // getter of height
        return this.height;
    }
    public void setWeight(double weight)   // setter of weight
    {
        this.weight = weight;
    }
    public double getWeight()              // getter of weight
    {
        return this.weight;
    }
    
    double calculateBMI(double height , double weight)          //
    {
        double BMI = this.weight / (this.height * this.height);  
        return  BMI;
    }
}
class Test
{
    BmiCalc c = new BmiCalc();
    Scanner sc = new Scanner(System.in);

    public void acceptRecord()
    {
        System.out.println("Enter Height : ");
        c.setHeight(sc.nextDouble());

        System.out.println("Enter Weight : ");
        c.setWeight(sc.nextDouble());
    }
    public void printRecord()
    {
        double a = c.calculateBMI(c.getHeight(),c.getWeight());
        System.out.println("your BMI is "+a);
    }
}
class Q2.2
{
    public static void main(String[] args) {
       Test t = new Test();
       t.acceptRecord();
       t.printRecord();         
    }
}
import java.util.Scanner;
class BmiCalc
{
    private double height;
    private double weight;

    BmiCalc()
    {
    }
    public void setHeight(double height)   // setter of height
    {
        this.height = height;
    }
    public double getHeight() {            // getter of height
        return this.height;
    }
    public void setWeight(double weight)   // setter of weight
    {
        this.weight = weight;
    }
    public double getWeight()              // getter of weight
    {
        return this.weight;
    }
    
    double calculateBMI(double height , double weight)
    {
        double BMI = this.weight / (this.height * this.height);  
        return  BMI;
    }
}
class Q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        BmiCalc b = new BmiCalc();              // instantiation

        System.out.println("Enter Height : ");
        b.setHeight(sc.nextDouble());

        System.out.println("Enter Weight : ");
        b.setWeight(sc.nextDouble());

        double a = b.calculateBMI(height,weight);
        System.out.println("your BMI is "+a);
    }
} 