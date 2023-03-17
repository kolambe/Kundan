/*public class compoundinterest{
	public static void main(String args[]){
		int Principal=50000000;
		int Time=5;
		float Rate=10.75F;
		float SI=(Principal*Time*Rate)/100;
		double Amount=Principal+SI;
		double Compound_Interest=(Amount-Principal);
System.out.println("Compound_Interest="+Compound_Interest);}}*/
		
		
//2 program		
	import java.io.*;
		public class compoundinterest{
		public static void main(String args[]){
			int P=500000000,T=5;
			double R=10.75d;
			double A=P*(Math.pow((1+R/100),T));
			double CI=A-P;
			System.out.println("CI="+CI);
		}
	}
